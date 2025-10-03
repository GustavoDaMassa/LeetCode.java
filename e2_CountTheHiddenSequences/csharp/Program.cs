using System;

public class Program
{
    public static void Main(string[] args)
    {
        Solution solution = new Solution();
        int[] differences = {1, -3, 4};
        int lower = 1;
        int upper = 6;
        int result = solution.NumberOfArrays(differences, lower, upper);

        Console.WriteLine("Input differences: [" + string.Join(", ", differences) + "]");
        Console.WriteLine("Input lower: " + lower);
        Console.WriteLine("Input upper: " + upper);
        Console.WriteLine("Output: " + result);
    }
}
