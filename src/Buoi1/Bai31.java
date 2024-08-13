package Buoi1;

import java.util.Scanner;

public class Bai31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[N];
        int[] brr = new int[M];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            brr[i] = sc.nextInt();
        }
        int temp[] = new int[N + M];

        for (int i = 0; i < P; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < M; i++) {
            temp[P+i] = brr[i];
        }
        for (int i = P; i < N; i++) {
            temp[M+i] = arr[i];
        }
        for (int x : temp)
            System.out.print(x + " ");
    }

    ;
}
