package LeetCode.SlidingWindown;

import java.util.*;
import java.util.stream.Collectors;

public class Longest_Harmonious_Subsequence_594 {
    class Solution {
        public static int findLHS(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap();
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    Integer value = map.get(nums[i]);
                    map.put(nums[i], ++value);
                } else {
                    map.put(nums[i], 1);
                    set.add(nums[i]);
                }
            }

            List<Integer> setList = new ArrayList<>();
            setList.addAll(set);
            Collections.sort(setList);
            int result = 0;
            for (int i = 0; i < setList.size(); i++) {
                if (Math.abs(setList.get(i) - setList.get(i + 1)) ==1 )
                {
                    int valueBoth = map.get(setList.get(i)) + map.get(setList.get(i + 1));
                    result = Math.max(result, valueBoth);
                }
            }

            return result;

        }
    }

    public static void main(String[] args) {
        int[] nums = {0,3,1,3,3,3,0,1,0,2,0,3,1,3,-3,2,0,3,1,2,2,-3,2,2,3,3};
        System.out.print(Solution.findLHS(nums));

    }
}
