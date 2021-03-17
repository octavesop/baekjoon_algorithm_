package kr.co.while4;
import java.util.Scanner;
public class APlusB_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            if(num+num2==0) {
                break;
            }
            else {
                System.out.println(num+num2);
            }
        }
    }
}