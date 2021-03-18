package kr.co.array5;
import java.util.*;
public class Maxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxNum=-0;
        int maxGrade = 0;
        int[] arr = new int[9];
        for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();
            if(i==0||maxNum<arr[i]) {
                maxNum = arr[i];
                maxGrade = i+1;
            }
        }
        System.out.println(maxNum);
        System.out.print(maxGrade);
    }
}
