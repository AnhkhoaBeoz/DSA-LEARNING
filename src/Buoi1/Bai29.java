package Buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai29 {
    static int cnt[] = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
        }

        int maxValue = 0;
        int maxIndex = -1;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > 0) {
                if (cnt[i] > maxValue) {
                    maxValue = cnt[i];
                    maxIndex = i;
                }
                if (cnt[i] == maxValue && i != maxIndex) {
                    maxIndex = Math.min(i, maxIndex);
                }
            }
        }
        System.out.println(maxIndex + " " + maxValue);
    }
}
