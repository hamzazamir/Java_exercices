package com.qa.java.oop;

public class Main {
    public static void main(String[] args) {

        Product pd1;
        pd1 = new Product();
        pd1.productID = 10001;
        pd1.productName = "Apple";
        pd1.productSalePrice = 2.99F;
        pd1.productCategory = "Fruit";
        pd1.productRating = 4;
        pd1.productDiscountPercentage = 4;
        pd1.productAvailable = true;

        //line 18 - 24 does the same thing as line 26

        System.out.println(pd1.productID);
        System.out.println(pd1.productName);
        System.out.println(pd1.productSalePrice);
        System.out.println(pd1.productCategory);
        System.out.println(pd1.productRating);
        System.out.println(pd1.productDiscountPercentage);
        System.out.println(pd1.productAvailable);

        //does the same thing as line 18 - 24
        pd1.displayPdInfo();


        Product pd4;
        pd4 = new Product();
        System.out.println(pd4.productName);

        Product pd5;
        pd5 = new Product(1234, "PD5", 10.99F, "PD5", (byte) 5, (byte) 10,
                false);


        System.out.println(pd5.productName);

        System.out.println(pd1.discountValue());

        System.out.println(pd1.finalPrice());

        System.out.println(Product.COMPANY_NAME);
        System.out.println(Product.COMPANY_EMAIL);
        System.out.println(Product.COMPANY_REVENUE);


    }

}
