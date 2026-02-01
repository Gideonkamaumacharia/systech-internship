package Assement3_Gideon_Kamau.Problem3.Electronics;

import Assement3_Gideon_Kamau.Problem3.Electronics.Exceptions.InvalidPowerConsumptionException;
import Assement3_Gideon_Kamau.Problem3.Electronics.Exceptions.InvalidWarrantyPeriodException;
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
        this.setWarrantyPeriod(warrantyPeriod); ;
        this.setPowerConsumption(powerConsumption);
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
        if(powerConsumption > 0){
            throw new InvalidPowerConsumptionException("Invalid power consumption!");
        }
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
    * Multiply the baseprice with the discount
    * Compute how many whole months there are from today to the warrantyPeriod date
    * If the months are greater than the warranty threshold,we add the discount
     * */
    @Override
    public double calculateDiscount() {
        final double PERCENT_DISCOUNT = 0.10;
        final double EXTRA_LONG_WARRANTY_DISCOUNT = 50.0;
        final long WARRANTY_THRESHOLD_MONTHS = 12L;

        double discountAmount =getBasePrice() * PERCENT_DISCOUNT;
        long monthsOfWarranty = java.time.temporal.ChronoUnit.MONTHS.between(java.time.LocalDate.now(), this.warrantyPeriod);
        if (monthsOfWarranty > WARRANTY_THRESHOLD_MONTHS) {
            discountAmount += EXTRA_LONG_WARRANTY_DISCOUNT;
        }
        return discountAmount;
    }

    //Overriding getProductType & providing implementation
    @Override
    public ProductType getProductType() {
        return ProductType.ELECTRONICS;
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();

        // Adding Electronics-specific details
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
        System.out.println("Power Consumption: " + powerConsumption + "W");

        // calculated financial details
        System.out.println("Discount: -$" + String.format("%.2f", calculateDiscount()));
        System.out.println("Final Price (with tax): $" + String.format("%.2f", applyTax()));
        System.out.println("------------------------------");
    }

}
