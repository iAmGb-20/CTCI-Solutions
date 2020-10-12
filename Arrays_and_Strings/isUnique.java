public class isUnique
{
    //Test case = "abcde"-->return true
    //Test case 2 = "aabcde"--> return false

    //helper function..to help compare two characters
    public boolean compareChar (char a, char b)
    {
        if (a == b)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean isunique(String s)
    {
        
        for (int i = 0; i < s.length()-1; i++)
        {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            //System.out.println("current a is: " + a + "\n" + "and current b is: " + b+  "\n");
            if (!compareChar(a, b))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        isUnique tester = new isUnique();
        String s = "abcde";
        String t = "aabce";
        System.out.println("Boolean value is: " + tester.isunique(s));
        System.out.println("Boolean value is: " + tester.isunique(t));
    }

}
