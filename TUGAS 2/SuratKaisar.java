import java.util.*;

class Persegi{
        private int sisi; 
        
        Persegi(int sisii){
            this.sisi = sisii; 
        }
        
        int getLuas(){
            int luas = sisi*sisi;
            return luas;
        }
        
        
    }

    class Segitiga{
        private int alas;
        private int tinggi;
        
        Segitiga(int alass,int tinggii){
            this.alas = alass;
            this.tinggi = tinggii;
        }
        int getLuas(){
            int Luas = (alas*tinggi)/2;
            return Luas;
        }
    }

    class Lingkaran{
        
            void getLuas(int r){
                if(r==7){
                    double uas = 22/7*r*r;
                    int keluar = (int)uas;
                    System.out.print((double)keluar);
                }else{
                    double uas = 3.14*r*r;
                    int keluar = (int)uas;
                    System.out.print((double)keluar);
                }
            }
        
    }
public class Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int pilihan = input.nextInt();
        int jari;
        
        if(pilihan==1){
            int sisi = input.nextInt();
            Persegi persegiAja = new Persegi(sisi);
            System.out.print(persegiAja.getLuas());
            
        }else if(pilihan==2){
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            Segitiga segitigaAja = new Segitiga(alas,tinggi);
            System.out.print(segitigaAja.getLuas());
            
        }else if(pilihan==3){
            
            jari = input.nextInt();
            Lingkaran lingkaranAja = new Lingkaran();
            
            lingkaranAja.getLuas(jari);
            
        }else{
            System.out.print("Input yang anda masukan tidak sesuai");
        }
            
    }
}
