public class SearchRange
{
    /* 
    nums = {5,7,7,8,8,10} target = 8
    in case we dont find [-1,-1]
    */
    public int[] search (int[] nums, int target)
    {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while (start < end)
        {
            int mid = start + (end-start)/2; //to avoid integer overflow
            if (nums[mid] > target)
            {
                
            }

        }
    }
}
