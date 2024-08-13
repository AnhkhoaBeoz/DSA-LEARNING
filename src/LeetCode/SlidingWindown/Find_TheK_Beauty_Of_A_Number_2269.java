package LeetCode.SlidingWindown;

public class Find_TheK_Beauty_Of_A_Number_2269 {
    class Solution {
        public static int divisorSubstrings(int num, int k) {

            String nums = String.valueOf(num);
            int count = 0;
            String windown = "";
            for (int i = 0; i < k; i++) {
                windown = windown.concat(String.valueOf(nums.charAt(i)));
            }
            if (Integer.valueOf(num) % Integer.valueOf(windown) == 0 && Integer.valueOf(windown) != 0 )
                count++;

            for (int i = k; i < nums.length(); i++) {
                if (!windown.isEmpty()) {
                    if (Integer.valueOf(windown) != 0  && windown.length() == k) {

                            if (Integer.valueOf(num) % Integer.valueOf(windown) == 0)
                            {
                                count++;
                                int positionPrev = i - k;
                                windown = nums.substring(positionPrev, i);
                        }
                    }
                }


            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.print(Solution.divisorSubstrings(430043, 2));
    }
}
