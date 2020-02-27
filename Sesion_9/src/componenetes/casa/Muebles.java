/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componenetes.casa;

/**
 *
 * @author ian
 */
public class Muebles {
    private String marca;
    private String material;
    private String color;

    public Muebles() {
    }

    public Muebles(String marca, String material, String color) {
        this.marca = marca;
        this.material = material;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Muebles{" + "marca=" + marca + ", material=" + material + ", color=" + color + '}';
    }
    

    
}
