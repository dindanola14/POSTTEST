/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
//class tambahan
public class Lingkaran {
    
    //void method hitung
    void hitung(){
        //mendefinisikan atribut
        double luaslingkaran, jarijari;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai jari - jari = ");
        jarijari = input.nextDouble();
        
        //menghitung luas lingkaran
        luaslingkaran = jarijari*jarijari*22/7;
        System.out.println("Luas Lingkaran = "+luaslingkaran);
    }
    
}
