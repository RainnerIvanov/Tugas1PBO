/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Rumusbangunruang extends Maintugas {
  
    double LPbalok(double panjang, double lebar, double tinggi){
        return 2 *((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));//rumus 
    }
     double LPkubus(double rusuk){
        return 6 * rusuk * rusuk;
    }
    double LPlimaspersegi(double sisi, double tinggiselimut ){
        return ((sisi*sisi) + (4 * 0.5 * sisi * tinggiselimut));
    }
    double Vbalok(double panjang, double lebar, double tinggi){
        return panjang*lebar*tinggi;
    }
    double Vkubus(double rusuk){
        return rusuk*rusuk*rusuk;
    }
    double Vlimaspersegi(double sisi, double tinggiselimut){
        return 
                ((sisi*sisi*sisi) * tinggiselimut) * 1/3;
    }
}
