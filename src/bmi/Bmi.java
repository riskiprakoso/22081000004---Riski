/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Bmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner masukan = new Scanner (System.in);
        int jk;
        float berat, tinggi, bmi, meter;
        String nama;
        person person= new person ();
        System.out.println("Masukkan Namamu");
        nama =  masukan.nextLine();
        System.out.println("Jenengmu" +nama);
        System.out.println("Program Perhitungan BMI");
        System.out.println("Masukkan Jenis Kelamin mu (1.Laki laki) | (2. Perempuan )");
        jk = masukan.nextInt();
        System.out.println("masukkan berat badan: ");
        person.berat = masukan.nextFloat();
        System.out.println("Masukkan tinggi badan :");
        person.tinggi = masukan.nextFloat();
        
        
        meter=person.tinggi/100;
        person.bmi=Math.round(person.berat /(meter * meter ));
        
        
        System.out.println("============================");
        System.out.println("BMI : "+person.bmi+"");
        
        
        
        if (person.bmi <18.5) {
            System.out.println("KREMPENG CILIK ELEK");
        }
        else if (person.bmi <=22.9) {
            System.out.println("SEDENGAN APIK GAK MBOIS");
        }
        else if (person.bmi<24.9) {
            System.out.println("LEMU KAKEAN MANGAN");
        }
        else{
            System.out.println("OBESITAS MANGAN TOK KOLESTROL");
        }
        // TODO code application logic here
    }
    
}
