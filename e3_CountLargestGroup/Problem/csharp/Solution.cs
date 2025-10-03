
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int CountLargestGroup(int n) {
        Dictionary<int, int> count = new Dictionary<int, int>();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (count.ContainsKey(sum)) {
                count[sum]++;
            } else {
                count[sum] = 1;
            }
        }

        if (count.Count == 0) return 0;

        int maxValue = count.Values.Max();
        return count.Values.Count(v => v == maxValue);
    }
}
