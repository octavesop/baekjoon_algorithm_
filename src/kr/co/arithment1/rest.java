package kr.co.arithment1;
import java.util.Scanner;
public class rest {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        Scanner one = new Scanner(System.in);
        A = one.nextInt();
        B = one.nextInt();
        C = one.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
