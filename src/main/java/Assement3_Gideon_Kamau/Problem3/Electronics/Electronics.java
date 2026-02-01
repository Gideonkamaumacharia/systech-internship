package Assement3_Gideon_Kamau.Problem3.Electronic;

import Assement3_Gideon_Kamau.Problem3.Electronic.Exceptions.InvalidWarrantyPeriodException;
import Assement3_Gideon_Kamau.Problem3.Exceptions.InvalidPriceException;
import Assement3_Gideon_Kamau.Problem3.Product;
import Assement3_Gideon_Kamau.Problem3.ProductType;

import java.time.LocalDate;

public class Electronics extends Product {

    //Properties
    private LocalDate warrantyPeriod;
    private double powerConsumption;

    //constructor --> uses the super keyword to invoke the parent constructor
    public Electronics(String productId, String productName, int stockLevel, double basePrice, ProductType productType, LocalDate warrantyPeriod, double powerConsumption)
            throws InvalidPriceException
    {
        super(productId, productName, stockLevel, basePrice, productType);
        this.warrantyPeriod = warrantyPeriod;
        this.powerConsumption = powerConsumption;
    }

    public LocalDate getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(LocalDate warrantyPeriod) {
        if(warrantyPeriod == null){
            throw new InvalidWarrantyPeriodException("Warranty period cannot be null!");
        }
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    //method overrides
    /*
    * Override all methods in the parent class
    * provide implementation for the getProductType() &calculateDiscount() methods
    *
    * */

    @Override
    public double applyTax() {
        return super.applyTax();
    }
    /*
    * We are going to apply a 10% discount on every Electronic product
    * */
    @Override
    public double calculateDiscount() {
        final double PERCENT_DISCOUNT = 0.10;
        final double EXTRA_LONG_WARRANTY_DISCOUNT = 50.0;
        final long WARRANTY_THRESHOLD_MONTHS = 12L;


        double discountAmount =getBasePrice() * PERCENT_DISCOUNT;
        if(this.warrantyPeriod != null){
            discountAmount += 50.0;
        }
        return discountAmount;
    }

    @Override
    public ProductType getProductType() {
        return null;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
    }
}
