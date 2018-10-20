/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117116.latihan49.emaskawin;

/**
 *
 * @author 
 * NAMA  : Muhammad Fitrayana
 * Kelas : PBO3
 * NIM   : 10117116
 * Deskripsi Tugas : Membuat Program Menghitung Harga Emas
 *  
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PBO310117116Latihan49EmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        DecimalFormat mataUangIndonesia = (DecimalFormat) 
                      DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
        
        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(formatRP);
        
        
        Emas objEmas = new Emas();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.printf("Total Bayar Emas : %s %n ", 
                           mataUangIndonesia.format(
                           objEmas.perhitungan(objEmas.getHargaGram(), 
                           objEmas.getBeratEmas())));
    
        
    }
    
}
