import java.util.*;
import java.io.*;

public class Solution{
    public static void main(String[] argsv)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());


        List<Domino> dList = new ArrayList<Domino>();
        List<Tuple> tList = new ArrayList<Tuple>();

        List<Domino> result = new ArrayList<Domino>();



        for(int i = 0;i<n;i++){

            StringTokenizer st = new StringTokenizer(br.readLine());
            Domino  d =  new Domino();
            d.left = Integer.parseInt(st.nextToken());
            d.right = Integer.parseInt(st.nextToken());
            dList.add(d);

        }

        Tuple t = new Tuple();
        t.index = 0;
        t.flag = true;
        tList.add(t);

        result.add(dList.get(0));

        for(int i = 1;i<dList.size();i++){
            int f = find(dList,result.get(i-1).right);
            if(f != -1){
                if(result.get(i-1).right == dList.get(f).left){
                    Tuple tt = new Tuple();
                    tt.index = f;
                    tt.flag = true;
                    tList.add(tt);
                    result.add(dList.get(f));
                }else{
                    Tuple tt = new Tuple();
                    tt.index = f;
                    tt.flag = false;
                    tList.add(tt);
                    result.add(dList.get(f));
                }
            }else{

            }
        }






        for(Domino d :dList){
            System.out.println(d.left+"    "+d.right);


        }
    }



    private static int  find(List<Domino> list, int num){
        for (int i = 0; i < list.size(); i++) {
            Domino d= list.get(i);
            if(d.left == num || d.right==num){
                return i;
            }
        }
        return -1;
    }

    static class  Tuple{
        int index;
        boolean flag;
    }

    static class Domino{
        int left;
        int right;
    }
}
