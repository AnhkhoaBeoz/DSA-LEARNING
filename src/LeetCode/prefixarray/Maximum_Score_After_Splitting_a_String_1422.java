//package LeetCode.prefixarray;
//
//public class Maximum_Score_After_Splitting_a_String_1422 {
//    class Solution {
//        int[] prefixLeft = new int[501];
//        int[] prefixRight = new int[501];
//
//        public int maxScore(String s) {
//            int idx = 1;
//            prefixLeft[0] = 0;
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '1') {
//                    prefixRight[idx++] = prefixLeft[idx - 1] + 1;
//                }
//            }
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) == '0') {
//
//                }
//            }
//        }
//    }
//}
