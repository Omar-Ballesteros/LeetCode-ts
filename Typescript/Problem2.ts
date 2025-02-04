function minPatches(nums: number[], n: number): number {
    let patches = 0;
    let missingNumber = 1;
    let i = 0;
    
    while (missingNumber <= n) {
        if (i < nums.length && nums[i] <= missingNumber) {
            missingNumber += nums[i];
            i++;
        } else {
            patches++;
            missingNumber += missingNumber;
        }
    }
    return patches;
};