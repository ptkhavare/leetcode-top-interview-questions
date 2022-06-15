class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (i != j) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int nums[] = { 1, 2, 3, 4 };
        System.out.println(solution.containsDuplicate(nums));
    }
}