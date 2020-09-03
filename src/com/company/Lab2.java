package com.company;

public class Lab2 {
    public static void main(String[] args){

        System.out.println("The sum is " + sum(3, 5));
        System.out.println("The mult is "+ mult(3, 5));
        System.out.println("The result is " + divide(3, 5));

   }

   static double sum(double first, double second) {
       double result = first + second;
       return result;
   }
   static float mult(float first, float second){
       float result = first * second;
       return result;
    }
    static double divide(double first, double second){
        double result = first / second;
    return result;
    }



}
