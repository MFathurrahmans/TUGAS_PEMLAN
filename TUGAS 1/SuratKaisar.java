import java.io.*;
import java.util.*;

public class Solution {
    public static void pergeseran(String apalah, int itulah){
        String simpan="";
        char karakter;
        
        for(int i=0; i<apalah.length();i++){
            karakter = apalah.charAt(i);
            
            if(karakter>='a' && karakter<='z'){
                karakter = (char)(karakter+itulah);
                if(karakter>'z'){
                    karakter = (char)(karakter+'a'-'z'-1); 
                }
                    simpan+=karakter; 
            }
           else if(karakter>='A' && karakter<='Z')
            {
                karakter = (char)(karakter+itulah);
                if(karakter>'Z'){
                    karakter = (char)(karakter+'A'-'Z'-1);
                }
                simpan+=karakter;
            }else{
                simpan += karakter;
            }
        }
        System.out.println(simpan);
    }
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kalimat = input.nextLine();
        int huruf = input.nextInt();
        
        pergeseran(kalimat, huruf);
        
        
    }
}