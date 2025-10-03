class Solution {
    numberOfArrays(differences: number[], lower: number, upper: number): number {
        let minDiffSum: number = 0;
        let maxDiffSum: number = 0;
        let diffSums: number = 0;

        for (const diff of differences) {
            diffSums += diff;
            minDiffSum = Math.min(minDiffSum, diffSums);
            maxDiffSum = Math.max(maxDiffSum, diffSums);
        }

        const minInitial: number = lower - maxDiffSum;
        const maxInitial: number = upper - minDiffSum;

        return Math.max(0, maxInitial - minInitial + 1);
    }
}

export { Solution };