package Assement3_Gideon_Kamau.Problem3;

import Assement3_Gideon_Kamau.Problem3.Exceptions.InvaliProductIdException;
import Assement3_Gideon_Kamau.Problem3.Exceptions.InvalidPriceException;
import Assement3_Gideon_Kamau.Problem3.Exceptions.InvalidProductDataException;
import Assement3_Gideon_Kamau.Problem3.Exceptions.InvalidProductNameException;

public abstract class Product {

    //properties
    private String productId;
    private String productName;
    private double basePrice;
    private int stockLevel;
    private ProductType productType;

    private static final double TAX_RATE = 0.10;

    //constructor
    public Product(String productId, String productName, int stockLevel, double basePrice, ProductType productType) throws InvalidPriceException {
        this.setProductId(productId);
        this.setProductName(productName);
        this.setStockLevel(stockLevel);
        this.setBasePrice(basePrice);
        this.setProductType(productType); ;
    }

    //getters and setters

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        if(productId == null || productId.trim().isEmpty()){
            throw new InvaliProductIdException("Product ID cannot be null or empty!");
        }
        if(!productId.toUpperCase().startsWith("PRDCT-")){
            throw new InvaliProductIdException("Product ID must begin with PRDCT-!");
        }
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(productName == null || productName.trim().isEmpty()){
            throw new InvalidProductNameException("Product name must not be null or empty!");
        }
        this.productName = productName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) throws InvalidPriceException {
        if(basePrice <= 0){
            throw new InvalidPriceException("Base price must be a positive number!");
        }
        this.basePrice = basePrice;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        if (stockLevel <= 0) {
            throw new InvalidProductDataException("Stock level cannot be negative!");
        }
        this.stockLevel = stockLevel;

    }

    //The getter for ProductTYpe is of type ProductType and is abstract
    public abstract ProductType getProductType();

    public void setProductType(ProductType productType) {
        if (productType == null) {
            throw new InvalidProductDataException("Product type cannot be null!");
        }
        this.productType = productType;
    }

    //abstract calculateDiscount()
    public abstract double calculateDiscount();

    //Concrete methods
    /*
    *Theres no need to validate basePrice cuz I called setBasePrice() in the constructor
    * Took the declared final double TAX_RATE. multiply it by basePrice
    * Return taxAmount plus the price
    * */
    public double applyTax() {
        double taxAmount = this.basePrice * TAX_RATE;
        return taxAmount + this.basePrice;

    }

    public void displayProductInfo(){

        System.out.println("--- Item Details ---");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Stock Level: " + stockLevel);

        String productTypeDisplay = (getProductType() != null) ? getProductType().toString() : "UNSPECIFIED";
        System.out.println("Product Type: " + productTypeDisplay);
    }
}
