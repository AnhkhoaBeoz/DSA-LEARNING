package Buoi1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai28 {
    static int cnt[] = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (Bai28.cnt[arr[i]] == 0)
                Bai28.cnt[arr[i]] = 1;
            else {
                Bai28.cnt[arr[i]]++;
            }

        }

        int max = Arrays.stream(arr).max().getAsInt();

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            for (int j = 0; j < Bai28.cnt.length; j++) {
                if (value == j && cnt[j] != 0) {
                    System.out.println(j + " " + cnt[j]);
                    cnt[j] = 0;
                }
            }
        }
    }
}
