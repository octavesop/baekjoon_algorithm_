package kr.co.String7;
import java.util.Scanner;
public class Croatia {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i=0; i<str.length; i++){
            if(input.contains(str[i])){
                input = input.replace(str[i],"0");
            }
        }
        System.out.println(input.length());

    }
}
