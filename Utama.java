/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_pertemuanketiga;

/**
 *
 * @author LENOVO
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TenagaMedis dokter = new Dokter();
        TenagaMedis perawat = new Perawat();

        // Menampilkan tugas dan pengalaman kerja tenaga medis (Override)
        dokter.tampilkanTugas();
        dokter.pengalamanKerja();
        perawat.tampilkanTugas();
        perawat.pengalamanKerja();

        // Menampilkan detail tugas (Overload)
        System.out.println("");
        System.out.println("Detail Tugas Dokter:");
        dokter.tampilkanDetail();
        dokter.tampilkanDetail("Operasi Bedah");

        System.out.println("");
        System.out.println("Detail Tugas Perawat:");
        perawat.tampilkanDetail();
        perawat.tampilkanDetail("Merawat Pasien ICU");
    }
}

