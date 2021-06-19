package kr.co.BasicMath9;
import java.io.*;
import java.util.Scanner;

public class FactorWithPrime {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    count++;
                }
            }
            if(i!=1&&count==2&&num%i==0) {
                System.out.println(i);
                num = num/i;
            }
        }
    }
}
