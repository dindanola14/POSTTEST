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
//main class
public class Main {
   public static void main(String[] args){
       String jawaban;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Apa yang ingin anda cari? [ Luas Lingkaran / Luas Persegi ]");
       System.out.print("Jawaban = ");
       jawaban = input.nextLine();
       
       //percabangan
       switch(jawaban){
           case "Luas Lingkaran":
               System.out.println("============================================================");
               //object
               Lingkaran luas = new Lingkaran();
               //pemanggilan method
               luas.hitung();
               break;
           case "Luas Persegi":
               System.out.println("=============================================================");
               //object
               Persegi Luas = new Persegi();
               //pemanggilan method
               Luas.hitung();
               break;
           default:
               System.out.println("NOTE : ");
               System.out.println("Tulis Jawaban sesuai yang ada di pilihan");
               System.out.println("Cermati huruf kapitalnya, sesuaikan penulisan dengan pilihan");
       }
      
           
       }
       }
