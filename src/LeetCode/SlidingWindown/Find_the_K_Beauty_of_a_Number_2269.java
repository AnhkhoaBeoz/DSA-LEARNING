package SlidingWindown;

public class Find_the_K_Beauty_of_a_Number_2269 {
    class Solution {
        public static int divisorSubstrings(int num, int k) {

            String nums = String.valueOf(num);
            int count = 0;
            if (k == nums.length())
                return 1;
            String windown = new String();
            for (int i = 0; i < k; i++) {
                windown = windown.concat(String.valueOf(nums.charAt(i)));
            }

            if (Integer.valueOf(num) % Integer.valueOf(windown) == 0)
                count++;
            for (int i = k; i < nums.length(); i++) {
                int positionPrev = i - k;
                windown = windown.substring( 1, windown.length()) + String.valueOf(nums.charAt(i));
                if (!windown.isEmpty() && Integer.valueOf(windown) != 0 && Integer.valueOf(num) % Integer.valueOf(windown) == 0)
                    count++;

            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.divisorSubstrings(240, 2));
    }
}
