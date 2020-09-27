package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {


      //  List<Integer> myList = new ArrayList<Integer>();
        //myList.add(0);
LogicalOperations logic6 = new LogicalOperations();
List<Integer> listTest = new ArrayList<Integer>();
        listTest.add(4);
        listTest.add(6);
        listTest.add(8);
        listTest.add(10);
        listTest.add(12);
       //logic6.stringValueToPosition(listTest, 2, "ana");

   // logic6.addValueAtFinal(listTest, 23);
        //logic6.fromValueToEnd(listTest, 3);
        //logic6.lastToFirst(listTest, "crocodil");
       // logic6.printListValues(listTest, 2);
        //logic6.fromLastToFirst(listTest);
        //logic6.indexForValue(listTest);
        System.out.println(logic6.maxNumberList(listTest));
    }



    }



