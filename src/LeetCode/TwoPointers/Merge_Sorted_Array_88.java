package LeetCode.TwoPointers;

import java.util.Arrays;

public class Merge_Sorted_Array_88 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int left = m;
            int right = n-1;
            while (left < nums1.length) {
                if (nums1[left] == 0) {
                    if (right >= 0) {
                        nums1[left] = nums2[right];
                        left++;
                        right--;
                    }
                } else if (nums1[left] != 0)
                    left++;
            }
            Arrays.sort(nums1);
            for (int i : nums1)
                System.out.print(i + " ");
        }
    }
}
