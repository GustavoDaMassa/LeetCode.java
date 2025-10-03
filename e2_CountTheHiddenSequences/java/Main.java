package e2_CountTheHiddenSequences.java;

public class Main {
    public static void main(String[] args) {
        Solution_TimeExcepted solution = new Solution_TimeExcepted();
        int[] differences = {1, -3, 4};
        int lower = 1;
        int upper = 6;
        int result = solution.numberOfArrays(differences, lower, upper);
        System.out.println("Input differences: " + java.util.Arrays.toString(differences));
        System.out.println("Input lower: " + lower);
        System.out.println("Input upper: " + upper);
        System.out.println("Output: " + result);
    }
}
