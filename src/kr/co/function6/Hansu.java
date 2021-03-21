package kr.co.function6;
import java.util.Scanner;
public class Hansu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int han=99;
        int hundredToTen;
        int tenToOne;

        for(int i=100; i<=n; i++) {
            hundredToTen = i / 100 - i / 10 % 10;
            tenToOne = i / 10 % 10 - i % 10;
            if (hundredToTen == tenToOne) {
                han++;
            }
        }

        if (n<100) {
            System.out.println(n);
        } else {
            System.out.println(han);
        }
    }
}

