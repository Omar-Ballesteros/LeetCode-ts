class Solution {
    public int minPatches(int[] nums, int n) {
        long faltante = 1;
        int patches = 0;
        int index = 0;

        while (faltante <= n) {

            if (index < nums.length && nums[index] <= faltante) {
                faltante += nums[index];
                index++;

            } else {
                patches++;
                faltante = faltante * 2;
            }

        }
        return patches;
    }
}