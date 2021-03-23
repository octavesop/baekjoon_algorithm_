package kr.co.BasicMath8;
import java.io.*;
public class ClimbSnail {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String[] arr = str.split(" ");
        int a= Integer.parseInt(arr[0]);
        int b= Integer.parseInt(arr[1]);
        int v= Integer.parseInt(arr[2]);
        int sum=0;
        int count = 0;

        while(true) {
            sum = sum+a;
            count= count+1;
            if(sum>=v) {
                bw.write(String.valueOf(count));
                break;
            } else {
                sum = sum-b;
                continue;
            }
        }
        bw.close();

    }
}
