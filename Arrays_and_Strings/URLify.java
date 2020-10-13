public class URLify 
{
    /*
    Test cases: 1) Input: "I am GB  "
                2) Output: "I%20am%20GB"
                
                1) Input: "Hey its Gb"
                2) Output: "Hey%20its%20Gb"
    pseudocode:
        loop through the string to count the number of spaces, variable: count--should be a method
        then start at the end of the string and insert the characters 02% in this order
        Have a pointer "oldindex" to check the position of the current character
        Have a pointer "newindex" that is ahead of oldindex that writes the new characters or moves them
        Move characters to the right-how though?--maybe use a specific number?? (newIndex = currlength + no.of spaces*2 - 1)
        Have a loop that checks for spaces, if there is a space then move the curr char to the right by 2
    */
    public int countofSpaces (int start, int end, char space, char[] str)
    {
        int count = 0;
        for (int i = start; i < end; i++)
        {
            if (str[i] == space)
            {
                count++;
            }
        }
        return count;
    }

    public void urlify (char[] target, int actualLength)
    {
        int countSpaces = countofSpaces(0, actualLength, ' ', target);
        int newIndex = actualLength - 1 + countSpaces*2;
        char space = ' ';
        if (newIndex+1 < target.length)
        {
            target[newIndex+1] = '\0';
        }
        //we loop backwards: if there is a space then we add 02%, otherwise we just rewrite the character at the right index
        for (int oldIndex = actualLength-1; oldIndex >= 0; oldIndex--)
        {
            if (target[oldIndex] == space)
            {
                target[newIndex] = '0';
                target[newIndex-1] = '2';
                target[newIndex-2] = '%';
                newIndex-=3;
            }
            else
            {
                target[newIndex] = target[oldIndex];
                newIndex--;
            }
        }
    }

    public static void main(String args[])
    {
        //nothing to do here...method works
        //most optimal solution
    }
    

    
}