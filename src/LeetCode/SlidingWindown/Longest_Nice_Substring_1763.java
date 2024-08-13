package LeetCode.SlidingWindown;

public class Longest_Nice_Substring_1763 {
    class Solution {
        public String longestNiceSubstring(String s) {

            String windows = s.substring(0, 1);

            String maxResult = "";
            for (int i = 1; i < s.length(); i++) {

                if (windows.contains(String.valueOf(s.charAt(i)).toLowerCase())
                        || windows.contains(String.valueOf(s.charAt(i)).toUpperCase())) {
                    windows = windows.concat(String.valueOf(s.charAt(i)));

                    if (maxResult.length() < windows.length())
                        maxResult = windows;
                } else {

                    windows = "" + s.charAt(i);
                }
            }
            return maxResult.length() > 1 ? maxResult : "";
        }
    }
}
