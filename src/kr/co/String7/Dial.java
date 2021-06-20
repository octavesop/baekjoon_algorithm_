package kr.co.String7;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Dial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        byte[] bytes = str.getBytes(StandardCharsets.US_ASCII);
        int sum=0;
        int count=3;
        for (int i=0; i<bytes.length; i++) {
            count = count + (bytes[i]%65)/3;
            if(bytes[i]==83||bytes[i]==86||bytes[i]==89||bytes[i]==90) {
                count--;
            }
            if(bytes[i]<65||bytes[i]>90) {
                count=11;
            }
            if(bytes[i]<65||bytes[i]>90) {
                count=11;
            }
            sum = sum + count;
            count = 3;
        }
        System.out.println(sum);
    }
}
