class Solution {
    public void rotate(int[] nums, int k) {
        for (; k > 0; k--) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 2; i > -1; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = temp;
        }

    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        int steps = 3;
        solution.rotate(nums, steps);
    }
}