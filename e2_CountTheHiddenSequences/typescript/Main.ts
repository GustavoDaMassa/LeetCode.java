import { Solution } from './Solution';

function main() {
    const solution = new Solution();
    const differences = [1, -3, 4];
    const lower = 1;
    const upper = 6;
    const result = solution.numberOfArrays(differences, lower, upper);

    console.log("Input differences: [" + differences.join(", ") + "]");
    console.log("Input lower: " + lower);
    console.log("Input upper: " + upper);
    console.log("Output: " + result); // Expected output for this example is 2
}

main();