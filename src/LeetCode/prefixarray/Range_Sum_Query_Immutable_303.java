package LeetCode.prefixarray;

public class Range_Sum_Query_Immutable_303 {
    class NumArray {

        int[] prefixArr = new int[10000];

        public NumArray(int[] nums) {
            prefixArr[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixArr[i] = prefixArr[i - 1] + nums[i - 1];
            }

        }

        public int sumRange(int left, int right) {

            return prefixArr[right] - prefixArr[left - 1];
        }
    }
}
