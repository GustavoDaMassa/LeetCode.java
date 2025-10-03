import { Solution } from './Solution';

function main() {
    const solution = new Solution();
    const n = 13;
    const result = solution.countLargestGroup(n);

    console.log("Input n: " + n);
    console.log("Output: " + result); // Expected output for n=13 is 4
}

main();