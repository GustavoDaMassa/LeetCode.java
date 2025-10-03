
using System;

public class Solution {
    public int NumberOfArrays(int[] differences, int lower, int upper) {
        long minDiffSum = 0, maxDiffSum = 0, diffSums = 0;

        foreach (int diff in differences) {
            diffSums += diff;
            minDiffSum = Math.Min(minDiffSum, diffSums);
            maxDiffSum = Math.Max(maxDiffSum, diffSums);
        }

        long minInitial = lower - minDiffSum;
        long maxInitial = upper - maxDiffSum;

        return (int)Math.Max(0, maxInitial - minInitial + 1);
    }
}
