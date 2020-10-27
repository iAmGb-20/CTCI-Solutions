public class String_compression 
{
    /*
    Give a string such as aabcccccaaa...I should return the no of occurences for each character
    return a2b1c5a3
    if characters are unique then just return the original string
    string has both uppercase and lower case letters

    Procedure:
    - use a string builder

    */

    public String compress (String k)
    {
        StringBuilder compressed = new StringBuilder();
        int count = 0;
        for (int i = 0; i < k.length(); i++)
        {
            count++;
            if (k.charAt(i) != k.charAt(i+1)|| i+1 >= k.length())
            {
                compressed.append(k.charAt(i));
                compressed.append(count);
                count = 0;
            }
          
        }
        if (compressed.length() < k.length())
        {
            return compressed.toString();
        }
        return k;
    }

}
