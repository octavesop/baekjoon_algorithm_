package kr.co.String7;
import java.util.Scanner;
public class NumOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] arr = input.split(" ");

        if(arr.length > 0)
        {
            if("".equals(arr[0]))
                System.out.println(arr.length-1);
            else
                System.out.println(arr.length);
        }else
        {
            System.out.println("0");
        }
    }
}
