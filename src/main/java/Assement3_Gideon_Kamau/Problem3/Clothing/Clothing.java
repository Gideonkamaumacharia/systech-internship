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

    /*
     * The main method serves as a unit test for the Clothing class.
     * It demonstrates successful object creation and handles specific
     * custom exceptions to satisfy the assessment's error-handling requirements.
     */
    public static void main(String[] args) {
        System.out.println("--- Starting Clothing Product System Test ---\n");

        /*
         * SCENARIO 1: Successful Clothing Creation
         * Testing where all data is valid.
         * Material is set to 'Cotton' to trigger the extra $5 discount logic.
         */
        try {
            System.out.println("TEST 1: Valid Clothing Creation (Cotton Material)");
            Clothing summerShirt = new Clothing(
                    "PRDCT-C001",
                    "Summer T-Shirt",
                    100,
                    40.0,
                    ProductType.CLOTHING,
                    "Large",
                    "Cotton",
                    "Sky Blue"
            );
            summerShirt.displayProductInfo();
        } catch (Exception e) {
            System.out.println("Unexpected Error in Test 1: " + e.getMessage());
        }

        /*
         * SCENARIO 2: Size Validation (InvalidProductSizeException)
         * Attempting to create clothing with an empty size string.
         */
        try {
            System.out.println("\nTEST 2: Triggering Size Validation (Empty Size)");
            Clothing invalidSize = new Clothing(
                    "PRDCT-C002", "Jeans", 50, 60.0, ProductType.CLOTHING,
                    "", // Invalid size
                    "Denim", "Blue"
            );
        } catch (InvalidProductSizeException e) {
            System.out.println("Validation Error Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        /*
         * SCENARIO 3: Color Validation (InvalidProductColorException)
         * Attempting to create clothing with a null color reference.
         */
        try {
            System.out.println("\nTEST 3: Triggering Color Validation (Null Color)");
            Clothing invalidColor = new Clothing(
                    "PRDCT-C003", "Sweater", 20, 85.0, ProductType.CLOTHING,
                    "Medium", "Wool",
                    null // Invalid color
            );
        } catch (InvalidProductColorException e) {
            System.out.println("Validation Error Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        System.out.println("\n--- Clothing System Test Completed ---");
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
