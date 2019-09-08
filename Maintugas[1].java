/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 */
public class Maintugas {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        Scanner main = new Scanner(System.in);
        
        Rumusbangunruang bangunruang= new Rumusbangunruang();
            do{ //perulangan
                System.out.println("Pilih : ");
                System.out.println("1.Luas Permukaan");
                System.out.println("2.Volume");
                int pilih = main.nextInt(); //menginput menu pertama
                    switch(pilih){//statement pengendalian
                case 1:
                System.out.println("Luas permukaan \n1.Balok \n2.Kubus\n3.Limas Persegi");
                System.out.println("pilih : ");
               
                int lp = main.nextInt(); //menginput bangun ruang mana yang dihitung
                if(lp == 1){ //statement pengendalian
                System.out.println("Panjang : ");
                double panjang = main.nextDouble();//inputnya
                System.out.println("Lebar : ");
                double lebar = main.nextDouble();
                System.out.println("Tinggi");
                double tinggi = main.nextDouble();
                System.out.println("Luas Permukaan : " + bangunruang.LPbalok
                (panjang,lebar,tinggi));//outputnya
            } else if(lp == 2){
                    System.out.println("Rusuk : ");
                    double rusuk = main.nextInt();
                    System.out.println("Luas Permukaan :" + bangunruang.LPkubus
                    (rusuk));
            }
            else if(lp == 3){
                    System.out.println("Sisi : ");
                    double sisi = main.nextInt();
                    System.out.println("Tinggi selimut : ");
                    double tinggiselimut = main.nextInt();
                    System.out.println("Luas Permukaan : " + bangunruang.LPlimaspersegi
                    (sisi,tinggiselimut));
            }
            else{
                    System.out.println("error");
            }
                break;
                case 2 :
                    System.out.println("Volume \n1.Balok \n2.Kubus \n3.Limas Persegi");
                    System.out.println("Pilih : ");
                    int vol = main.nextInt();
                if(vol == 1){
                    System.out.println("Panjang : ");
                    double panjang = main.nextInt();
                    System.out.println("Lebar : ");
                    double lebar = main.nextInt();
                    System.out.println("Tinggi");
                    double tinggi = main.nextInt();
                    System.out.println("Volume : " + bangunruang.Vbalok(panjang, lebar, tinggi));
                }else if(vol == 2){
                    System.out.println("Rusuk : ");
                    double rusuk = main.nextInt();
                    System.out.println("Volume : " +bangunruang.Vkubus(rusuk));
                }else if(vol == 3){
                    System.out.println("Sisi : ");
                    double sisi = main.nextInt();
                    System.out.println("Tinggi selimut : ");
                    double tinggiselimut = main.nextInt();
                    System.out.println("Volume : " + 
                            bangunruang.Vlimaspersegi(sisi, tinggiselimut));
                }else{
                    System.out.println("error");
                }
                break;
                default :
                    System.out.println("error");
                    }
            } while (true);
    }
}
            
                
            
    
            
    
    
    

           
