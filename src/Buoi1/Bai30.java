package Buoi1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// DÙNG MẢNG 1 CHIỀU
public class Bai30 {
    static int cnt[] = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N <= 100) {

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                cnt[arr[i]]++;
            }

            int maxValue = -1;
            int key = -1;
            for (int i = 0; i < N; i++) {
                if (cnt[arr[i]] > 0 && cnt[arr[i]] > maxValue) {
                    maxValue = cnt[arr[i]];
                    key = arr[i];
                }
            }
            System.out.println(key + " " + maxValue);
        }
    }
}
/// Dùng hashMap
