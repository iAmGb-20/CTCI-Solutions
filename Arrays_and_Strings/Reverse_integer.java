public class Reverse_integer {
    
    public int reverse (int toreverse)
    {
        int temp = 0;
        while (toreverse!=0)
        {
            temp = temp*10 + toreverse%10;
            toreverse/=10;
        }
        return temp;
    }
}
