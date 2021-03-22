package kr.co.String7;
import java.util.Scanner;
public class FindAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String temp = sc.next();

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(temp.indexOf(i) + " ");
        }
    }
}