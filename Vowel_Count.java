import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b;
        int n = in.nextInt(),cont=0;
        in.nextLine();
        int[] count=new int[n];
        
        for(int i=0;i<n;i++){
            cont=0;
            
            a=in.nextLine();
            
            
            
            for(int j=0;j<a.length();j++){
                
                b=Character.toString(a.charAt(j));
                
                if(b.equals("a") || b.equals("e") || b.equals("i") || b.equals("o") || b.equals("u") || b.equals("y") ){
                cont++;
                
                }
            }
            
            count[i]=cont;
        }
       for(int z=0;z<n;z++){
           System.out.println(count[z] + " ");
       }
    }

}

DATA.lst 