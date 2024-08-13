package Buoi1;

import java.util.Scanner;

public class Bai1 {
    static int[] cnt = new int[1000000];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalOdd = 0;
        int sumOdd = 0;
        int sumEven = 0;
        int totalEven = 0;
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 ==0){
                totalEven++;
                sumEven+=arr[i];
            } else {
                totalOdd++;
                sumOdd+=arr[i];
            }
        }


        System.out.println(totalEven);

        System.out.println(totalOdd);
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
