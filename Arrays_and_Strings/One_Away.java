public class One_Away 
{
    /*
    check if two strings are one edit away from each other
    Edits are insert,remove, replace
    test cases:
    pale, ple -> true
    pales, pale -> true
    pale, bale -> true
    pale, bake -> false
    pseudocode:
    foundReplace functions which checks if one character has been replaced in a string
    foundInsert which checks if there is a character added or removed from a string
    */
    //s is the longer string
    public static boolean foundInsert (String s, String t)
    {
        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < s.length() && ptr2 < t.length())
        {
            if (s.charAt(ptr1) == t.charAt(ptr2))
            {
                ptr1++;
                ptr2++;
            }
            else
            {
                if (ptr1 != ptr2)
                {
                    return false;
                }
                ptr1++;
            }
        }

        return true;
    }

    //perfect! 
    public static boolean foundReplace (String s, String t)
    {
        boolean foundChar = false;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) != t.charAt(i))
            {
                if (foundChar)
                {
                    return false;
                }
                foundChar = true;
            }
        }
        return true;
    } 
    public static boolean checkEdit (String s, String t)
    {
        if (s.length() == t.length())
        {
            return foundReplace(s, t);
        }
        else if (s.length()-1 == t.length())
        {
            return foundInsert(s, t);
        }
        else if (s.length()+1 == t.length())
        {
            return foundInsert(t, s);
        }
        return false;
    }

    public static void main(String args[])
    {
        String s = "pale";
        String t = "bake";
        System.out.println("One edit away? -- " + checkEdit(s, t));
    }
}