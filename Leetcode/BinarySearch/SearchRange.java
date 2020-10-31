public class SearchRange
{
    /* 
    nums = {5,7,7,8,8,10} target = 8
    in case we dont find [-1,-1]
    */
    public int[] search (int[] nums, int target)
    {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    private int findFirst(int[] nums, int target)
    {
        int index = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end)
        {
            int mid = start + (end-start)/2;
            if (nums[mid] >= target)
            {
                end = mid -1;
            }
            else
            {
                start = mid + 1;
            }
            if (nums[mid] == target) 
            {
                index = nums[mid];
            }
        }
        return index;
    }
    private int findLast(int[] nums, int target)
    {
        int mid = start + (end-start)/2;
        if (nums[mid] <= target)
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
        if (nums[mid] == target)
        {
            index = nums[mid];
        }
        return index;
    }
}
