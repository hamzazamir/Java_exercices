package com.qa.java.array;

public class ArrayMain {
    public static void main(String[] args) {

        int[] nums = {1, 6, 2, 8, 3, 9, 15, 1};


        ArrayMethods arrayMethods = new ArrayMethods();


        int sum = arrayMethods.sumOfArrayElements(nums);
        System.out.println(sum);


        int highNumber = arrayMethods.highestNumberInArray(nums);
        System.out.println(highNumber);


        int lowNumber = arrayMethods.lowestNumberInArray(nums);
        System.out.println(lowNumber);


        Product[] pds = {
                new Product(10002, "Banana", 2.50F, "Fruit",
                        (byte) 5, (byte) 8, true),

                new Product(10003, "Carrot", 4.50F, "Vegetable",
                        (byte) 6, (byte) 10, false),

                new Product(10002, "Apple", 3.50F, "Fruit",
                        (byte) 8, (byte) 8, true),
        };

        Product cheapestProduct = arrayMethods.getProductWithLowestPrice(pds);
        System.out.println("Our cheapest costs : " + cheapestProduct.productSalePrice + " the product is : " + cheapestProduct.productName);
    }

}
