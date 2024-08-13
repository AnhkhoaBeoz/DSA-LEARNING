package Buoi1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai27 {
    static int cnt[] = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (Bai27.cnt[arr[i]] == 0)
                Bai27.cnt[arr[i]] = 1;
            else {
                Bai27.cnt[arr[i]]++;
            }

        }


        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] != 0)
                System.out.println(i + " " + cnt[i]);
        }
    }

}
