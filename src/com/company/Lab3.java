package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Lab3 {
    public static void main(String[] args) {
       LogicalOperations logic = new LogicalOperations();
       // System.out.println(logic.verifyHigherNumber(10, 20));
      //  System.out.println(logic.verifyText(textInput:"a"));
       //ystem.out.println(logic.textAndNumber("FastTrack", 5));
        MathOperations math = new MathOperations();
        System.out.println(math.divide(20, 30));
        System.out.println(math.sum(20, 40));
        System.out.println(logic.forecastSnow(99));
        System.out.println(logic.theNumberIs(6));
        System.out.println(logic.theXIs(8));
        System.out.println(logic.isNumberEven(7));
        System.out.println(logic.isEligibleToVote(12));
        System.out.println(logic.higherNumberIs(2,2,2));
}
}

