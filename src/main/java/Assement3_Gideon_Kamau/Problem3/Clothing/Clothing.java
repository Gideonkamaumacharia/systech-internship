package Assement3_Gideon_Kamau.Problem3.Clothing;

import Assement3_Gideon_Kamau.Problem3.Clothing.Exceptions.InvalidProductColorException;
import Assement3_Gideon_Kamau.Problem3.Clothing.Exceptions.InvalidProductMaterialException;
import Assement3_Gideon_Kamau.Problem3.Clothing.Exceptions.InvalidProductSizeException;
import Assement3_Gideon_Kamau.Problem3.Exceptions.InvalidPriceException;
import Assement3_Gideon_Kamau.Problem3.Product;
import Assement3_Gideon_Kamau.Problem3.ProductType;

public class Clothing extends Product {
    //properties
    private String size;
    private String material;
    private String color;

    //constructor

    public Clothing(String productId, String productName, int stockLevel, double basePrice, ProductType productType, String size, String material, String color)
            throws InvalidPriceException, InvalidProductSizeException, InvalidProductColorException {
        super(productId, productName, stockLevel, basePrice, productType);
        this.setSize(size);
        this.setMaterial(material);
        this.setColor(color );
    }

    //Getters and setters

    public String getSize() {
        return size;
    }

    public void setSize(String size) throws InvalidProductSizeException {
        if(size == null || size.trim().isEmpty()){
            throw new InvalidProductSizeException("Invalid size");
        }
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if(material == null || material.trim().isEmpty()){
            throw new InvalidProductMaterialException("Invalid material!");
        }
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws InvalidProductColorException {
        if(color == null || color.trim().isEmpty()){
            throw new InvalidProductColorException("Invalid product color!");
        }
        this.color = color;
    }

    @Override
    public ProductType getProductType() {
        return ProductType.CLOTHING;
    }

    @Override
    public double calculateDiscount() {
        double discount = getBasePrice() * 0.15;

        if ("Cotton".equalsIgnoreCase(this.material)) {
            discount += 5.0;
        }
        return discount;
    }


    @Override
    public double applyTax() {
        return super.applyTax();
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Savings: -$" + String.format("%.2f", calculateDiscount()));
        System.out.println("Total after Tax: $" + String.format("%.2f", applyTax()));
        System.out.println("------------------------------");
    }

}
