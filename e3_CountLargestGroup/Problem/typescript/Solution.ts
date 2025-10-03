class Solution {
    countLargestGroup(n: number): number {
        const count = new Map<number, number>();
        for (let i = 1; i <= n; i++) {
            let sum = 0;
            let num = i;
            while (num !== 0) {
                sum += num % 10;
                num = Math.floor(num / 10);
            }
            count.set(sum, (count.get(sum) || 0) + 1);
        }

        if (count.size === 0) {
            return 0;
        }

        let maxValue = 0;
        for (const value of count.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        let groups = 0;
        for (const value of count.values()) {
            if (value === maxValue) {
                groups++;
            }
        }
        return groups;
    }
}

export { Solution };