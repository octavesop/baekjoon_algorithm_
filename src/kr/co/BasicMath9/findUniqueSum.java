package kr.co.BasicMath9;
import java.io.*;
import java.util.Scanner;

public class findUniqueSum {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count=0;
        int sum = 0;
        int min = 0;

        for(int i=m; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(i>1&&count==2) {
                sum = sum+i;
                if(min==0||min>i) {
                    min = i;
                }
            }

            count = 0;
        }

        if(sum!=0) {
            System.out.println(sum);
        }

        if(min!=0) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
