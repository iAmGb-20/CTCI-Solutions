import java.util.*;

public class check_Permutation
{
    //test cases: "abcde"
    //             "dceab" --> return true
    //test case 2: "abkd"
    //             "bd" --> return false

    /*
    pseudocode:
    loop through the first string and put the characters in the hashtable
    check if characters in the second string are in the hashtable
    */

    public static boolean isPermutation (String s1, String s2)
    {
        //checking if s2 is a permutation of s1
        if (s1.length()!= s2.length())
        {
            return false;
        }
        Hashtable<Character, Integer> checker = new Hashtable<Character, Integer>();
        for (int i = 0; i < s1.length(); i++)
        {
            checker.put(s1.charAt(i), i);
        }
        for (int j = 0; j < s2.length(); j++)
        {
            
            if (!checker.containsKey(s2.charAt(j)))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[])
    {
        String s = "abcde";
        String t = "deabc";
        System.out.println("this is a permutation? : " + isPermutation(s, t));
    }

}
