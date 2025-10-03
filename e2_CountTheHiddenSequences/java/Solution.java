package e2_CountTheHiddenSequences.java;

class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long minDiffSum = 0, maxDiffSum = 0, diffSums = 0;

        for (int diff : differences) {
            diffSums += diff;
            minDiffSum = Math.min(minDiffSum, diffSums);
            maxDiffSum = Math.max(maxDiffSum, diffSums);
        }

        long minInitial = lower - minDiffSum;
        long maxInitial = upper - maxDiffSum;

        return (int)Math.max(0, maxInitial - minInitial + 1);
    }
}

