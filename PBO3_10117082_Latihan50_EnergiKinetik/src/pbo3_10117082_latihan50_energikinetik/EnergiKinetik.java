/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan50_energikinetik;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan perhitungan
* energi kinetik dan usaha dari suatu bola dengan massa dan kecepatan yang sudah 
* ditentukan
 */
public class EnergiKinetik {
    private double massa;
    private double kecepatan;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double hitungEnergiKinetik(){
        return 0.5*massa*(kecepatan*kecepatan);
        
    }
    public double hitungUsaha(){
        return 0.5*massa*(kecepatan*kecepatan) - 0.5*massa*(0*0);
        
    }
    
}
