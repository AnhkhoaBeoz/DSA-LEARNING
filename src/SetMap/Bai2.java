package SetMap;

import java.util.HashSet;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            set.add(x);
        }

        while(t-- > 0) {
            int x = sc.nextInt();
            if(set.contains(x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
     }

}