package Buoi1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai26 {
    static int cnt[] = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            Bai26.cnt[arr[i]] = 1;
        }

        int count = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 1) ++count;
        }
        System.out.print(count);
    }

}
