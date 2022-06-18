import java.io.*;
import java.util.*;

public class Solution {
    
    public static int balikinNilai(int a){
        int y= 0;
        int jumlah = a;
        int sisa;
            
        
        while(a!=0){
            sisa=a%10;
            y=(y*10)+sisa;
            a=a/10;
        }
        return y;
    }
    
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        //input integer number
        int x = input.nextInt();
        
        int terbalik = balikinNilai(x); 
        
        if(x==terbalik){
            System.out.print(x+" adalah selde.");
        }else{
            System.out.print(x+" bukan selde.");
        }
         
    }
}