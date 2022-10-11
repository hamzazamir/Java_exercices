package com.qa.java.array;

public class ArrayMethods {

    int sumOfArrayElements(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    int highestNumberInArray(int[] nums) {
        int highestNum = 0;
        for (int num : nums) {
            if (num > highestNum) {
                highestNum = num;
            }
        }
        return highestNum;
    }

    int lowestNumberInArray(int[] nums) {
        int lowestNum = 0;
        for (int num : nums) {
            if (num < lowestNum) {
                lowestNum = num;
            }
        }
        return lowestNum;
    }

    Product getProductWithLowestPrice(Product[] pds) {
        Product product = pds[0];
        for (Product pd : pds) {
            if (pd.productSalePrice < product.productSalePrice) {
                product = pd;
            }
        }
        return product;
    }
}
