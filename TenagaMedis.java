/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuanketiga;

/**
 *
 * @author LENOVO
 */
public abstract class TenagaMedis {
    
    //Method abstract yang harus di-override oleh subclass
    public abstract void tampilkanTugas();
    public abstract void pengalamanKerja();
    
    //overload method tanpa parameter
    public void tampilkanDetail(){
        System.out.println("ini adalah tugas tenaga medis");
    }
        
    // Overload method dengan parameter
    public void tampilkanDetail(String tugas) {
        System.out.println("Tugas: " + tugas);
    }
    
}
