package kr.co.while4;

import java.util.Scanner;

public class plusCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ten;
        int one;
        int sum=num;
        int count=0;
        while (true)
        {
            ten = sum/10;
            one = sum%10;
            if(ten+one>=10) {
                sum = (one*10)+(ten+one)-10;
            }
            else {
                sum = (one*10)+(ten+one);
            }

            count++;

            if(sum==num) {
                break;
            }
        }
        System.out.println(count);
    }
}
