package Buoi1;

import java.util.Scanner;

public class Bai24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        if (n>=k && k>=1)
        {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i <n; i++) {
                int check = i+k;
                if (check <= n)
                {
                    int sum=0;
                    for (int j = i; j < check; j++) {
                        sum+=arr[j];
                    }
                    System.out.println(sum);
                }
            }
        }
    }
}
