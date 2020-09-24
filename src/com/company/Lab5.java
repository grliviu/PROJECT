package com.company;

public class Lab5 {

    public static void main(String[] args) {

//Problema 2

      //  int[] myArray = new int[100];
        //for (int i=0; i<100;i++){
          //  myArray[i]=i+1;
            //System.out.println(myArray[i]);
        //}
LogicalOperations logic1 = new LogicalOperations();
int[] myArray  = logic1.getArrayNumber(100);

      //  System.out.println(logic1.averageArray(myArray));

        //int[] evenArray = logic1.evenArrayList(100);

       System.out.println(logic1.findString(new String[]{"mama", "tata", "bebe"}, "bebe"));
        System.out.println(logic1.valuePosition(myArray, 1));



//Problema 7

        String arrayPattern[][]={{"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-","-","-"}};


        for (int i=0; i< 10 ; i++)
        {
            for (int j=0; j < 10 ; j++)
                System.out.print(arrayPattern[i][j] + " ");

            System.out.println();
            System.out.println();
        }


        //Problema 8

   // int[] minusOneArray = logic1.listMinusOne(100, 3);
      //int[] array = logic1.secondSmallestNumber(0);
   // int[] array = logic1.secondSmallestNumber();
        //   int[] arrat, = {34,45,343,4,5};
//Problema 9
//int[] array = logic1.printSecondSmallest();
       System.out.println(logic1.secondSmallestValue(myArray));


//Problema 10

        int originalArray[] = {23,45,56,89,78,57,4,33,45,6,7};

        int cloneArray[] = originalArray.clone();


        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i]+" ");
        }



    }

    }




