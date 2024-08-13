package LeetCode.prefixarray;

public class Find_Pivot_Index_724 {

    //TODO: TRAU CAY
//    class Solution {
//        int[] prefixLeftArr = new int[10000];
//        int[] prefixRightArr = new int[10000];
//
//        public int pivotIndex(int[] nums) {
//
//
//            //[1,7,3,6,5,6]
//            for (int i = 0; i < nums.length; i++) {
//
//
//                int sumleft = 0;
//                int sumright = 0;
//                if (i == 0) {
//                    sumleft = nums[i];
//                } else {
//                    for (int j = i - 1; j >= 0; j++) {
//                        sumleft += nums[j];
//                    }
//                }
//                for (int j = nums.length - 1; j > i; j--) {
//                    sumright += nums[j];
//
//                }
//                if (sumleft == sumright) {
//                    return i;
//                }
//            }
//
//            return -1;
//        }
//    }

    //TODO: MANG PREFIX (MANG CONG DON)
    class Solution {
        int[] prefixArray = new int[10001];

        public int pivotIndex(int[] nums) {
            prefixArray[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                prefixArray[i] = prefixArray[i - 1] + nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                int left = 0;
                int right = 0;
                if (i == 0) {

                    right = prefixArray[nums.length - 1] - prefixArray[i];
                } else {
                    left = prefixArray[i - 1];
                    right = prefixArray[nums.length - 1] - prefixArray[i];
                }
                if (left == right) {
                    return i;
                }
            }
            return -1;
        }


    }

}
