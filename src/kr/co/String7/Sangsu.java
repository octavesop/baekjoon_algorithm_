package kr.co.String7;
import java.util.Scanner;
public class Sangsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a.charAt(2) +Character.toString(a.charAt(1))+Character.toString(a.charAt(0));
        String d = b.charAt(2) +Character.toString(b.charAt(1))+Character.toString(b.charAt(0));


        if(Integer.parseInt(c)>Integer.parseInt(d)) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }
}
