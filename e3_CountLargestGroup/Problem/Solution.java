package e3_CountLargestGroup.Problem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countLargestGroup(int n) {

        Map<Integer,Integer> count = new HashMap<>();
        for(int i =1; i<= n; i++){
            int soma =0;
            int num = i;
            while(num != 0){
                soma+= num%10;
                num/=10;
            }
            count.put(soma,count.getOrDefault(soma,0)+1);
        }
        int groups=0;
        int maxvalue = Collections.max(count.values());
        for(int c : count.values())if(c == maxvalue)groups++;
        return groups;
    }
}
