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
public class Ventanas {
    private String material;
    private int numeroDecristales;
    private float tamaño;

    public Ventanas() {
    }

    public Ventanas(String material, int numeroDecristales, float tamaño) {
        this.material = material;
        this.numeroDecristales = numeroDecristales;
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

    public int getNumeroDecristales() {
        return numeroDecristales;
    }

    public void setNumeroDecristales(int numeroDecristales) {
        this.numeroDecristales = numeroDecristales;
    }

    @Override
    public String toString() {
        return "Ventanas{" + "material=" + material + ", numeroDecristales=" + numeroDecristales + ", tama\u00f1o=" + tamaño + '}';
    }


    
}
