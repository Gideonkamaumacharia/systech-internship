package Assement3_Gideon_Kamau.Problem3;

import Assement3_Gideon_Kamau.Problem3.Exceptions.InvalidPriceException;

public class Clothing extends Product{
    //properties
    private String size;
    private String material;
    private String color;

    //constructor

    public Clothing(String productId, String productName, int stockLevel, double basePrice, ProductType productType, String size, String material, String color) throws InvalidPriceException {
        super(productId, productName, stockLevel, basePrice, productType);
        this.size = size;
        this.material = material;
        this.color = color;
    }
}
