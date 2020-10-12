public class isUnique
{
    //Test case = "abcde"-->return true
    //Test case 2 = "aacbde***-**********************************--> return false
    //Approach 1--most optimal
    public boolean isunique(String s)
    {
        boolean [] check = new boolean[128];
        for (int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i);
            if (check[curr])
            {
                return false;
            }
            check[curr] = true;
        }
        return true;
    }

    public static void main(String args[])
    {
        isUnique tester = new isUnique();
        String s = "hehlo";
        //String t = "aabce";
        System.out.println("Boolean value is: " + tester.isunique(s));
        //System.out.println("Boolean value is: " + tester.isunique(t));
    }

}
