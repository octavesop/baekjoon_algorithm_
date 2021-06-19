package kr.co.BasicMath9;
import java.io.*;
import java.util.Scanner;

public class findUnique {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int allNum = sc.nextInt();
        int count=0;
        int realCount = 0;
        for(int i=0; i<allNum; i++) {
            int numCase = sc.nextInt();
            for(int j=1; j<=numCase; j++) {
                if(numCase%j==0) {
                    count++;
                }
            }
            if(numCase>1&&count==2) {
                realCount++;
            }
            count = 0;
        }
        System.out.println(realCount);
    }
}
