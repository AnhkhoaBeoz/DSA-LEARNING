package LeetCode.prefixarray;

public class Minimum_Value_to_Get_Positive_Step_by_Step_Sum_1413 {
    class Solution {
        int[] prefixArr = new int[101];

        public int minStartValue(int[] nums) {

            prefixArr[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prefixArr[i] = prefixArr[i - 1] + nums[i];
            }
            int startValue = 1;
            while (startValue < 101) {
                boolean found = false;
                int sum = 0;
                for (int i : prefixArr) {
                    sum = startValue + i;
                    if (sum < 1) {
                        found = true;
                    }
                }
                if (found) {

                    startValue++;


                } else {
                    return startValue;
                }
            }


        return -1;
        }
    }
}
