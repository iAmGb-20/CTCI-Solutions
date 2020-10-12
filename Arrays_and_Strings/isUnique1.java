import java.util.Arrays;

public class isUnique1 
{
    /* O(nlogn) approach */
    public boolean approach2 (String s)
    {
        char[] result = s.toCharArray();
        Arrays.sort(result);
        for (int i = 1; i < result.length; i++)
        {
            if (result[i] == result[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        isUnique1 tester = new isUnique1();
        String s = "helo";
        //String t = "aabce";
        System.out.println("Boolean value is: " + tester.approach2(s));
    }
}
