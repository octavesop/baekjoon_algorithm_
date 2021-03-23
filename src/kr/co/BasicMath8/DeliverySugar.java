package kr.co.BasicMath8;
import java.util.Scanner;
public class DeliverySugar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar =  sc.nextInt();
        int count = 0;
        while(sugar!=0) {
            if(sugar%5==0) {
                sugar= sugar-5;
                count++;
            } else if(sugar%3==0) {
                sugar = sugar-3;
                count++;
            } else if(sugar>=5) {
                sugar = sugar-5;
                count++;
            } else {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
