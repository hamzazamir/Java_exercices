package com.qa.java.exercices;

public class DataTypeExerciceTwo {
    public static void main(String[] args) {

        //apple
        float apple;
        apple = 3.25F;
        System.out.println(apple);

        float appleDiscount;
        appleDiscount =  apple * 10 / 100;
        System.out.println(appleDiscount);

        float finalPrice;
        finalPrice = apple - appleDiscount;
        System.out.println("Apple discounted price is £" + finalPrice);

        //chicken
        float chicken;
        chicken = 7.25F;
        System.out.println(chicken);

        float chickenDiscount;
        chickenDiscount = chicken * 8 / 100;
        System.out.println(chickenDiscount);

        float chickenPrice;
        chickenPrice = chicken - chickenDiscount;
        System.out.println("Apple discounted price is £" + chickenPrice);

        //banana
        float banana;
        banana = 1.25F;
        System.out.println(banana);

        float bananaDiscount;
        bananaDiscount = banana * 3 / 100;
        System.out.println(bananaDiscount);

        float bananaPrice;
        bananaPrice = banana - bananaDiscount;
        System.out.println("Apple discounted price is £" + bananaPrice);

    }
}
