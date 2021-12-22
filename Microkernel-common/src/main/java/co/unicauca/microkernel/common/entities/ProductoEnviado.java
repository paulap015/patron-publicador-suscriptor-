/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.common.entities;

/**
 *
 * @author Paula
 */
public class ProductoEnviado {
    private int productId;
    private String name;

    private double weight;
  
    private double width;
    
    private double height;
    
    private double depth;
    private double price;
    private String country;

    public ProductoEnviado() {

    }

    public ProductoEnviado(int productId, String name, double weight, double width, double height, double depth,double price,String country) {
        this.productId = productId;
        this.name = name;
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.price=price;
        this.country=country;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double precio) {
        this.price = precio;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String pais) {
        this.country = pais;
    }
    
}
