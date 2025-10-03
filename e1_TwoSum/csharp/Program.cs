using System;

public class Program
{
    public static void Main(string[] args)
    {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.TwoSum(nums, target);

        Console.WriteLine("Input nums: [" + string.Join(", ", nums) + "]");
        Console.WriteLine("Input target: " + target);
        Console.WriteLine("Output: [" + string.Join(", ", result) + "]");
    }
}
