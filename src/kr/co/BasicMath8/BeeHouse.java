package kr.co.BasicMath8;
import java.util.Scanner;

public class BeeHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bee = sc.nextInt();
        int semi_count = 0;
        int ss_count = 0;
        int count = 0;
        while(true){
            semi_count = semi_count+ss_count;
            if(bee<=1+(6*semi_count)&&bee>=1+(6*(semi_count-ss_count))) {
                break;
            } else {
                count++;
                ss_count++;
            }
        }
        System.out.println(count+1);
    }
}
