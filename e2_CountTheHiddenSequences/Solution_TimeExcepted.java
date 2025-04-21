package e2_CountTheHiddenSequences;

class Solution_TimeExcepted {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        int initial = lower;
        int count = 0;
        int next;
        for(int c=0; initial<= upper; c++){
            int[] hidden = new int[differences.length + 1];
            int i = 0;
            hidden[i] = initial;
            for(; i<differences.length; i++){
                next = differences[i] + hidden[i];
                if(next>=lower && next<=upper)hidden[i+1] = next;
                else break;
            }
            initial++;
            if(i == differences.length)count++;
        }
        return count;
    }
}