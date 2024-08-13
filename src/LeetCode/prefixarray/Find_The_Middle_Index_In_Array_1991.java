package LeetCode.prefixarray;

public class Find_The_Middle_Index_In_Array_1991 {

    // TRÂU CÀY
    class Solution {

        public int findMiddleIndex(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int sumleft = 0, sumright = 0;
                int middleIndex = i;

                // Tính tổng bên trái
                for (int j = 0; j < middleIndex; j++) {
                    sumleft += nums[j];
                }

                // Tính tổng bên phải
                for (int j = middleIndex + 1; j < nums.length; j++) {
                    sumright += nums[j];
                }

                // So sánh tổng bên trái và bên phải
                if (sumleft == sumright) {
                    return middleIndex;
                }
            }
            return -1;
        }
    }


    //TODO: PREFIX ARR
//    class Solution {
//        int[] prefixArray = new int[10001];
//
//        public int findMiddleIndex(int[] nums) {
//
//            prefixArray[0] = nums[0];
//            for (int i = 1; i < nums.length; i++) {
//                prefixArray[i] = prefixArray[i - 1] + nums[i];
//            }
//            int sumPrefix = 0, sumSuffix = 0;
//            for (int i = 0; i < nums.length; i++) {
//                int middleIndex = i;
//                if (middleIndex == 0) {
//                    sumPrefix = 0;
//                    sumSuffix = prefixArray[nums.length - 1] - prefixArray[middleIndex];
//                } else if (middleIndex == nums.length - 1) {
//                    sumPrefix = prefixArray[middleIndex - 1];
//                    sumSuffix = 0;
//                } else {
//                    sumPrefix = prefixArray[middleIndex - 1];
//                    sumSuffix = prefixArray[nums.length - 1] - prefixArray[middleIndex];
//                }
//
//                if (sumPrefix == sumSuffix)
//                    return middleIndex;
//
//            }
//            return -1;
//        }
//    }
}
