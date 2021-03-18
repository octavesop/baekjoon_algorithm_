package kr.co.while4;
        import java.util.Scanner;
public class APlusB_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
        {
            int num = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(num+num2);
        }
    }
}
