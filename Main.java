import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(bf.readLine());
        int[] k=new int[a];
        int sum=0;
        for(int i=0; i<a; i++) k[i]=Integer.parseInt(bf.readLine());
        for(int i=a-1; i>0; i--){
            int x=Math.max(0,k[i-1]-k[i]+1);
            sum+=x;
            k[i-1]-=x;
        }
        System.out.println(sum);
    }
}