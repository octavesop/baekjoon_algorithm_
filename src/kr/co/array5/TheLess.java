package kr.co.array5;
import java.util.Scanner;
public class TheLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] value = new int[10];
        int count=0;
        int realCount = 0;
        for (int i = 0; i < 10; i++) {
            value[i] = (sc.nextInt())%42;
        }
        for (int i = 0; i < 10; i++) {
            count=0;
            for (int j=0; j < i; j++) {
                if(value[i]==value[j]) {
                    count++;
                }
            }
            if(count==0) {
                realCount++;
            }
        }
        System.out.println(realCount);
        sc.close();
    }
}
