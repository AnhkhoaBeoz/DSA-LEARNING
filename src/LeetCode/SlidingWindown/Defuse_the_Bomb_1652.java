package LeetCode.SlidingWindown;

import java.util.ArrayList;
import java.util.Arrays;

public class Defuse_the_Bomb_1652 {
    class Solution {
        public static int[] decrypt(int[] code, int k) {
            ArrayList<Integer> list = new ArrayList<>();
            int windown = 0;
            if (k == 0)
                for (int i = 0; i < code.length; i++) {
                    list.add(0);
                }
            else if (k > 0) {
                //Input: code = [5,7,1,5,6,4,4], k = 3
//                6 + 1 + 3 +1 /7
                //Output: [13,12,15,14,13,16,13]
                //Explanation: Each number is replaced by the sum of the next 3 numbers.
                // The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.

                for (int i = 1; i <= k; i++) {
                    windown += code[i];
                }
                for (int i = 0; i < code.length; i++) {
                    list.add(windown);

                    if (i < code.length - 1) {
                        int pos = (code.length  + i + k + 1) % code.length;
                        windown = windown - code[i + 1] + code[pos];
                    }
                }

            } else if (k < 0) {
                // Initialize window sum for the first window
                for (int i = code.length - 1; i >= code.length + k; i--) {
                    windown += code[i];
                }

                // Iterate over the array to adjust the window and store the results
                for (int i = 0; i < code.length; i++) {
                    list.add(windown);

                    // Adjust window sum for next position
                    if (i < code.length - 1) {
                        int pos = (code.length - 1 + i + k + 1) % code.length;
                        windown = windown + code[i] - code[pos];
                    }
                }
            }

            return list.stream().mapToInt(i -> i).toArray();
        }
    }

    public static void main(String[] args) {
        int[] code = {5,7,1,5,6,4,4};
        //[7,6,9,8,9]
        int k = 3;
        Arrays.stream(Solution.decrypt(code, k)).forEach(System.out::println);
    }
}
