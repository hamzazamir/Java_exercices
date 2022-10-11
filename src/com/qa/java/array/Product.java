package com.qa.java.array;

public class Product {

    int productID;
    String productName;
    float productSalePrice;
    String productCategory;
    byte productRating;
    byte productDiscountPercentage;
    boolean productAvailable;


    //No-arg Constructor
    Product() {
        System.out.println("Product() constructor is called...");
        productID = 10001;
        productName = "Product1";
        productSalePrice = 30;
        productCategory = "Product";
        productRating = 5;
        productDiscountPercentage = 15;
        productAvailable = false;

    }

    //Arg Constructor
    public Product(int productID, String productName, float productSalePrice, String productCategory, byte productRating,
                   byte productDiscountPercentage, boolean productAvailable) {
        this.productID = productID;
        this.productName = productName;
        this.productSalePrice = productSalePrice;
        this.productCategory = productCategory;
        this.productRating = productRating;
        this.productDiscountPercentage = productDiscountPercentage;
        this.productAvailable = productAvailable;


    }

    //behaviors ( methods )
    void displayPdInfo() {
        System.out.println(productID);
        System.out.println(productName);
        System.out.println(productSalePrice);
        System.out.println(productCategory);
        System.out.println(productRating);
        System.out.println(productDiscountPercentage);
        System.out.println(productAvailable);
    }

    float discountValue() {
        return productSalePrice * (float) productDiscountPercentage / 100;
    }

    float finalPrice() {
        return productSalePrice - discountValue();
    }

}
