/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan50_energikinetik;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan perhitungan
* energi kinetik dan usaha dari suatu bola dengan massa dan kecepatan yang sudah 
* ditentukan
 */
public class PBO3_10117082_Latihan50_EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       EnergiKinetik ek = new EnergiKinetik();
       ek.setMassa(145);
       ek.setKecepatan(25);
        System.out.println("Massa bola baseball adalah "+ek.getMassa()+" g");
        System.out.println("Kecepatannya adalah "+ek.getKecepatan()+" m/s");
         System.out.println("Energi Kinetiknya Adalah "+ek.hitungEnergiKinetik()
         +" Joule");
         System.out.println("Usaha bola untuk mencapai kecepatan tersebut dalam "
                 + "keadaan diam Adalah "+ek.hitungUsaha()+" Joule");
         
         
               
     }
    
}
