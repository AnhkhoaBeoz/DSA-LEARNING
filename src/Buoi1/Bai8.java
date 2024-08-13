package Buoi1;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai8 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                }
            }
            if (check == false) {
                System.out.print(arr[i] + " ");
            }
        }

    }


}
