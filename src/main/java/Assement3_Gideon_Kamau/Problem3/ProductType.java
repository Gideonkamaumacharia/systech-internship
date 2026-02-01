package Assement3_Gideon_Kamau.Problem3;

public enum ProductType {
    ELECTRONICS("Electronics"),
    CLOTHING("Clothing"),
    BOOKS("Books");

    private final String displayName;

    //Constructor
    ProductType(String displayName) {
        this.displayName = displayName;
    }

    // The getter method
    public String getDisplayName() {
        return displayName;
    }

    // Overriding toString to print nicely automatically
    @Override
    public String toString() {
        return displayName;
    }
}


//public Electronics(String id, String name, double price, int stock) {
//    super(id, name, price, stock, ProductType.ELECTRONICS);
//    // ... electronics specific fields ...
//}



