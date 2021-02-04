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
public class Persegi {
   
    //void method hitung
    void hitung(){
        //mendefinisikan atribut
        double luaspersegi, sisi;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai sisi = ");
        sisi = input.nextDouble();
        
        //menghitung luas persegi
        luaspersegi = sisi*sisi;
        System.out.println("Luas Persegi = "+luaspersegi);
    }
    
}
