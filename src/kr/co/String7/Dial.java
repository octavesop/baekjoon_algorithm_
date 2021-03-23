package kr.co.String7;
import java.util.Scanner;
public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum=0;
        for (int i=0; i<str.length(); i++) {
            if(i==0) {
                sum = sum+(int)str.charAt(i)-63;
            } else {
                if((int)str.charAt(i-1)-(int)str.charAt(i)<0) {
                    sum = sum+((int)str.charAt(i-1)-(int)str.charAt(i)-63)*-1;
                } else {
                    sum = sum+((int)str.charAt(i-1)-(int)str.charAt(i));
                }

            }
        }
        System.out.println(sum);
    }
}
