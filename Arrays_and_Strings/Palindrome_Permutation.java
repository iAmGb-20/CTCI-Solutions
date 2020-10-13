public class Palindrome_Permutation 
{

    /*
    SOLUTION--1
    Test case: "Tact coa" -->permutations(true: taco cat, atco cta, etc)
    --ignore the casing
    --only ASCII characters

    pseudocode--(TO-DO):
    We know that a palindrome reads the same forward and backward
    --we need to use this definition in our approacj
    --if the length of the string is even then every character needs to have an even count
    --if the length of the string is odd, then only one character should have an odd count
    thus, we need a method to check if there is a maximum of one character with an odd count
    we also need a function to get the numerical values of every character and map them to a number
    we need to build the table from this info that we have...this table will store the frequency of every character
    */

    public static int getCharNumber (Character c)
    {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(c);

        if (a <= value && value <=z)
        {
            return value - a;
        }
        return -1;
    }
    public static int[] buildTablefreq (String phrase)
    {
        int size = Character.getNumericValue('z') - Character.getNumericValue('a') + 1;
        int [] table = new int[size];

        for (char curr: phrase.toCharArray())
        {
            if (getCharNumber(curr) != -1)
            {    
                int x = getCharNumber(curr);
                table[x]++;
            }
        }
        return table;
    }

    public static boolean checkMaxOneOdd(int[] table)
    {
        boolean foundOdd = false;
        for (int x: table)
        {
            if (x%2 == 1)
            {
                //we need to check if we have already found an odd or not
                if (foundOdd)
                {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }
    
    public static boolean isPermutationPalindrome(String phrase)
    {
        int [] table = buildTablefreq(phrase);
        return checkMaxOneOdd(table);
    }


    public static void main(String args[])
    {
        System.out.println("Result for this is: " + isPermutationPalindrome("Tact Coa"));
    }

    


}
