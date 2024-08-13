package LeetCode.SlidingWindown;

import java.util.Arrays;
import java.util.HashMap;

public class Contains_Duplicate_II_219 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    Integer contains = map.get(nums[i]);
                    if (Math.abs(i - contains) <= k) {
                        return true;
                    }
                } else {
                    map.put(nums[i], i);
                }

            }
            return false;

        }
    }}
