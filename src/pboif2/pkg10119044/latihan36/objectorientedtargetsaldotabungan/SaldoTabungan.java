/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan36.objectorientedtargetsaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan program saldoTabungan
 * yang berbasis object oriented 
 */
class SaldoTabungan {
    public int saldoAwal = 3500000;
    public int saldoTarget = 6000000;
    public double bunga = 8;
    
    public void saldoAkhir(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        rupiah.setDecimalFormatSymbols(formatRp);
        
        int i =1;
        while(saldoAwal<=saldoTarget){
            int akhir = (int) (saldoAwal+((bunga/100)*saldoAwal));
            saldoAwal=akhir;
            
            System.out.println("Saldo di bulan ke-"+i+rupiah.format(akhir));
            i = i+1;
        }  
    }
}
