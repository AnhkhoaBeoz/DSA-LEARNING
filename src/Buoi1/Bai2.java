package Buoi1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (Bai2.checkSNT(arr[i])) {
                sum += arr[i];
                count++;
            }
        }
        System.out.printf("%.3f", (float) sum / count);
    }

    static boolean checkSNT(int a) {
        if (a <= 1)
            return false;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
