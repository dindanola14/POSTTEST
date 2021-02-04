/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttest2;

/**
 *
 * @author ASUS
 */
//main class
public class Main {
    public static void main(String[] args){
        
        //object
        Pohon data = new Pohon();
        data.setNama("Cemara");
        data.setTinggi("10 meter");
        System.out.println("Nama Pohon   = "+data.getNama());
        System.out.println("Tinggi Pohon = "+data.getTinggi());
       
        System.out.println("==========================================");
        
        //object
        Pohon data2 = new Pohon();
        data2.setNama("Kelapa");
        data2.setTinggi("30 meter");
        System.out.println("Nama Pohon   = "+data2.getNama());
        System.out.println("Tinggi Pohon = "+data2.getTinggi());
    }
}