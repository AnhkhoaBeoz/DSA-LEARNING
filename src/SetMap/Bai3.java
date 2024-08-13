package SetMap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i <n ; i++) {
            a[i] = sc.nextInt();
            setA.add(a[i]);
        }
        for (int i = 0; i <m ; i++) {
            b[i] = sc.nextInt();
            setB.add(b[i]);
        }
        for(int i = 0; i < n; i++) {
            setA.remove(55);
            if(setA.contains(a[i]) && !setB.contains(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
