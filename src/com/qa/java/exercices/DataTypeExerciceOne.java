package com.qa.java.exercices;

public class DataTypeExerciceOne {
    public static void main(String[] args) {

        float salary;
        salary = 35000;

        float incrementedSalary;
        incrementedSalary = (float) (salary * 10.5 / 100);
        System.out.println(incrementedSalary);

        float totalSalary;
        totalSalary = salary + incrementedSalary;
        System.out.println(totalSalary);
    }
}

