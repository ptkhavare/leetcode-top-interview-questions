class Solution {
    public int removeDuplicates(int[] nums) {
        int num = 0;
        if (nums.length == 1) {
            return num + 1;
        } else {
            for (int i = 0, j = 1; j < nums.length; j++) {

                if (nums[i] != nums[j]) {
                    nums[++i] = nums[j];
                }
                num = i + 1;
            }
        }
        return num;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(solution.removeDuplicates(nums));
    }

}
