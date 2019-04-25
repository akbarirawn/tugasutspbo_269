/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penugasanutspbo;

/**
 *
 * @author RYZEN
 */
public class Komputer {
    private CPU cpu;
    
    public Komputer (CPU cpu){
        this.cpu = cpu;
    }
    
    public void mencabut (CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : " + this.cpu.getCPUData() + " Ghz" + " Dicabut" );
    }
    public void memasang (CPU cpu){
        this.cpu = cpu;
        System.out.println("CPU : " + this.cpu.getCPUData() + " Ghz" + " Dipasang");
    }
    public void cetakInfo (){
        System.out.println("Spesifikasi : CPU : " + this.cpu.getCPUData() + " Ghz");
    }

    
}