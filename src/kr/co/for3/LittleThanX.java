package kr.co.for3;
import java.util.Scanner;

public class LittleThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i=0; i<num; i++) {
            int num3 = sc.nextInt();
            if(num3<num2) {
                System.out.print(num3+" ");
            }
        }
    }
}