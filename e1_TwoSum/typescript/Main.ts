import { Solution } from './Solution';

function main() {
    const solution = new Solution();
    const nums = [2, 7, 11, 15];
    const target = 9;
    const result = solution.twoSum(nums, target);

    console.log("Input nums: [" + nums.join(", ") + "]");
    console.log("Input target: " + target);
    console.log("Output: [" + result.join(", ") + "]");
}

main();