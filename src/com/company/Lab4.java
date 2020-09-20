package com.company;

public class Lab4 {
   public static void main(String[] args) {
       // int startNumber = 5;
       // for (int i = startNumber; i <= 100; i++) {
         // System.out.println(i);
       // }
       //Problema 1
      LogicalOperations logic = new LogicalOperations();
       logic.startNumberMethod(5);


      //Problema 2
       //int startNumberA = 5;
        //for (int i = startNumberA; i >= -100; i--) {
         //   System.out.println(i);
       // }
       logic.startNumberMethod1(5);

//Problema 3
     //  int startNumberB = 5;
       // int endNumber = 20;
        //for (int i = startNumberB; i <= endNumber; i++) {
          //  System.out.println(i);
        //}
       logic.startNumberEndNumber(11 , 23);
// Problema 4
      //  int a = 20;
        //int b = 4;
        //if (a < b) {
          //  for (int i = a; i <= b; i++) {
            //    System.out.println(i);
            //}
       // } else if (b > a) {
         //   for (int i = b; i <= b; i++) {
           //     System.out.println(i);
          //  }
        //}
       logic.lowerToHigher(20, 3 );
//Problema 5
        //for(int i=1;i<=100;i++){
          //  if(i % 2 == 0){
        //    System.out.println(i);
        //}}
logic.pNr(100);
       //Problems 6

        //for(int i=1;i<=100;i++){
          //  if(i % 2 == 1){
            //    System.out.println(i);
            //}}
       logic.impNr(100);

//Problema 7 /8

          // int sum = 4;
        //for(int i=sum;i<=100;i++){
          //  sum = sum + i;
            //    System.out.println(sum);
            //}

       logic.sumAndAverage(99, 100);
       logic.pattern(7);





// LOOP
//1
       logic.nrToHundred(97);

//2
       logic.nrToNegativeHundred(-97);

// 3
   logic.firstNumberSecondNumber(30, 40);
   //4
      logic.lowToHigh(7, 3);
//5

       logic.evenNr(100);

       //6
       logic.oddNr(100);
       //7
logic.doWhileSumAndAverage(1,5 );

       //8

logic.divisibility(1, 14);
logic.Fibonacci(20);
logic.cozaLozaWoza(11,110);
   }
}
