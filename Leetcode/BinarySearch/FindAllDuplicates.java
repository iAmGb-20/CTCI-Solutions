public class FindAllDuplicates
{
    public List<Integer> findDuplicates(int[] nums) {
        LinkedList<Integer> res = new LinkedList<>();
        for (int i = 0; i < nums.length; i++)
        {
            int current = Math.abs(nums[i]);
            if (nums[current-1] < 0)
            {
                res.add(current);
            }
            else
            {
                nums[current-1]*=-1;
            }
        }
        return res;
    }
}