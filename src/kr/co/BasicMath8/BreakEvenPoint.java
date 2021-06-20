package kr.co.BasicMath8;
import java.util.Scanner;
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt();
        int varCost = sc.nextInt();
        int cost = sc.nextInt();
        int sum = 0;
        if(varCost >= cost) {
            sum = -1;
        } else {
            sum = fixCost / (cost-varCost)+1;
        }
        System.out.println(sum);
    }
}
