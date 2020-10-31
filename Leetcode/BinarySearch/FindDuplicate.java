public class FindDuplicate
{
    public int findDuplicate(int[] nums) 
    {
      for (int i = 0; i < nums.length; i++)
      {
          int current = Math.abs(nums[i]);
          if (nums[current-1] < 0)
          {
              return current;
          }
          else
          {
              nums[current-1]*=-1;
          }
      }
        return -1;
    }
}