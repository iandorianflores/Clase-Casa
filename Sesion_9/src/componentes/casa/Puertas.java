/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes.casa;

/**
 *
 * @author ian
 */
public class Puertas {
    private String material; 
    private float peso;
    private float tamaño; 

    public Puertas() {
    }

    public Puertas(String material, float peso, float tamaño) {
        this.material = material;
        this.peso = peso;
        this.tamaño = tamaño;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Puertas{" + "material=" + material + ", peso=" + peso + ", tama\u00f1o=" + tamaño + '}';
    }
    

}
