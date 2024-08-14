package LeetCode.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Search_Insert_Position_35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {

            Arrays.sort(nums);

            if (Arrays.binarySearch(nums, target) < 0) {
                int[] temp = Arrays.copyOf(nums, nums.length + 1);
                temp[temp.length - 1] = target;
                Arrays.sort(temp);
                return Arrays.binarySearch(temp, target);
            }
            return Arrays.binarySearch(nums, target);
        }
    }
}
