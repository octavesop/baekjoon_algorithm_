package kr.co.for3;
import java.util.*;
public class APlusB_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);

        for(int i=1; i<=num; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            System.out.print("Case #"+i+": ");
            System.out.println(one+two);
        }
    }
}