import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String[] argsv)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int[][] input = new int[n][];
        int[][] output = new int[n][];
        String[] flag = new String[n];
        for(int i = 0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        }
        swap(input,0,3);

        //TODO


        for(int i = 0;i<n;i++){
            System.out.println(input[i][0]+"    "+input[i][1]);
        }
    }

    private static void swap(int[][] intArr,int a,int b){
        int[] tmp = intArr[a];
        intArr[a] = intArr[b];
        intArr[b] = tmp;
    }
}
