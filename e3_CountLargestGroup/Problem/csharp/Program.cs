using System;
using System.Linq;

public class Program
{
    public static void Main(string[] args)
    {
        Solution solution = new Solution();
        int n = 13;
        int result = solution.CountLargestGroup(n);

        Console.WriteLine("Input n: " + n);
        Console.WriteLine("Output: " + result);
    }
}
