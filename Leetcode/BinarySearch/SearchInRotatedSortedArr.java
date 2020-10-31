public class SearchInRotatedSortedArr
{
    public int search(int[] nums, int target) {
        int m = nums.length-1;
        int minIndx = findmin(nums);
        if (target == nums[minIndx]) return minIndx;
        int start = (target <= nums[m]) ? minIndx: 0;
        int end = (target <= nums[m]) ? m: minIndx;
        //we need to find out the bounds of our search
       
        
        while (start <= end)
        {
            int mid = start + (end-start)/2;
            if (nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target)
            {
                start = mid+1;
            }
            else if (nums[mid] > target)
            {
                end = mid-1;
            }
        }
        return -1;
    }

    public int findmin(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while (start < end)
        {
            int mid = start + (end-start)/2;
            if (nums[mid] > nums[end])
            {
                start = mid+1;
            }
            else if (nums[mid] < nums[end])
            {
                end = mid;
            }
        }
        return start;
    }
}