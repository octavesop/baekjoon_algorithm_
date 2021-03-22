package kr.co.String7;
import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int sum = 0;
        int charToInt = 0;
        String n = sc.next();
        for(int i=0; i<r; i++) {
            charToInt = Integer.parseInt(String.valueOf(n.charAt(i)));
            sum=sum+charToInt;
        }
        System.out.print(sum);
    }
}
