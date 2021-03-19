package kr.co.array5;
import java.util.*;
public class MiniMaxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxNum=0;
        int minNum=0;
        int[] arr = new int[num];
        for(int i=0; i<num; i++) {
            arr[i] = sc.nextInt();
            if(i==0||maxNum<arr[i]) {
                maxNum = arr[i];
            }
            if(i==0||minNum>arr[i]) {
                minNum = arr[i];
            }
        }
        System.out.print(minNum+" "+maxNum);
    }
}
