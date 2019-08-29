/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaPercabangan;

import java.util.Scanner;
/**
 *
 * @author necha
 */
public class ProgramPembayaranTagihanListrik {
    public static void main(String[] args) {
            int kWh;
            int biaya;
            Double Total;
            
            //scanner
            Scanner baca = new Scanner(System.in);
            
            //input
            System.out.println("Program Pembayaran Tagihan Listrik");
            System.out.print("Input jumlah kWh per bulan:");
            kWh = baca.nextInt();
            
            //penggolongan
            if(kWh <= 450) {
                System.out.println("Golongan C");
                biaya = 20000 + (1000 * kWh);
                System.out.println("Biaya " + biaya);
                System.out.println("\nBiaya total");
                Total = Double.valueOf((biaya * 10/100) + biaya);
                System.out.println("Biaya total: " + Total);
                
            } else if(kWh <=900) { 
                System.out.println("Golongan B");
                biaya = 35000 + (2500 * kWh);
                System.out.println("Biaya " + biaya);
                System.out.println("\nBiaya total");
                Total = Double.valueOf((biaya * 15/100) + biaya);
                System.out.println("Biaya total: " + Total);
                
            } else if(kWh <1200) {
                System.out.println("Golongan A");
                biaya = 50000 + (3000 * kWh);
                System.out.println("Biaya " + biaya);
                System.out.println("\nBiaya total");
                Total = Double.valueOf((biaya * 20/100) + biaya);
                System.out.println("Biaya total: " + Total);
                
            } else
                System.out.println("kWh 1200+ tidak tersedia dalam kategori ini, silahkan coba lagi");
          
        }
    
}
    

