package kr.co.arithment1;
import java.util.Scanner;
public class divide {
    public static void main(String[] args) {
        double one_num;
        double two_num;
        Scanner one = new Scanner(System.in);
        one_num = (double)one.nextInt();
        two_num = (double)one.nextInt();
        System.out.println(one_num/two_num);
    }
}
