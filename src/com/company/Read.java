package com.company;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
//Tema Try-Catch
    //Problema 1

  //  public int getInt() {
    //    int number = 0;
      //  boolean repeat = true;
        //while (repeat) {
          //  try {
            //    Scanner scan = new Scanner(System.in);
              //  System.out.print("Introduceti valoarea");
                //number = scan.nextInt();
                //repeat = false;
            //} catch (InputMismatchException e){
            //System.out.println("Invalid provided value");
            //}
        //}

    //return number;}
    //Problema 2
    //public float getFloat() {
      //  float number = 0;
       // boolean repeat = true;
        //while (repeat) {
          //  try {
            //    Scanner scan = new Scanner(System.in);
              //  System.out.print("");
                //number = scan.nextFloat();
                //repeat = false;
           // } catch (InputMismatchException e){
             //   System.out.println("Invalid provided value");
            //}
       // }

       // return number;}

//Problema 3

    public int[] printArray(int nrPozitii) {
        int[] myArray = new int[nrPozitii];
        Scanner scanare = new Scanner(System.in);
            for(int i =0;i<myArray.length;i++){
                System.out.println("Valori: ");
                myArray[i]=scanare.nextInt();
                System.out.println(myArray[i]);
            }


        return myArray;
    }




    //Problema 4
   // public int returnList(List<Integer>myList){
     //  int number = 0;
       // boolean repeat = true;
       // while(true){
          //  try {
            //    Scanner scan = new Scanner(System.in);
              //  System.out.print("Please populate list: ");
                //number = scan.nextInt();
                //repeat = false;
            //} catch (InputMismatchException e){
              // System.out.println("Invalid provided value");
            //}
        //}

       // return number ;
        //}



    }


