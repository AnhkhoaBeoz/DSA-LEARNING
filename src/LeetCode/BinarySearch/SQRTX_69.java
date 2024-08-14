package LeetCode.BinarySearch;

public class SQRTX_69 {
    class Solution {
        public static int mySqrt(int x) {
            return binarySearch(x);

        }

        public static int binarySearch(int x) {
            int left = 0, right = x;

            int res = 0;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) mid * (long) mid == x) {
                    return mid;
                } else if ((long) mid * (long) mid < x) {
                    left = mid + 1;
                    res = mid;
                } else if ((long) mid * (long) mid > x) {
                    right = mid - 1;
                }
            }
            return res;
        }
    }

    public static void main(String[] args) {

        Solution.binarySearch(2147395599);
    }
}
