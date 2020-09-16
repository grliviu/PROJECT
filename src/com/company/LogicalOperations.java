package com.company;

public class LogicalOperations {




    public int verifyHigherNumber(int a , int b){

        if (a > b){
            return a;
        }
        else {
            return b;
        }

}
public String verifyText(String textInput){
    if (textInput.equals("a")) {
        return "a";
    } else {
        return "try some more";

    }}


    //public String textAndNumber(String input , int n){


      //  if input.equals("FastTrack ") && n<= 3{
      //       return input + n;
       // }
        //else if !input.equals("FastTrack ")&& n>= 4 {
    //return  n + input;
   // }

    public String forecastSnow(int number){
               if (number > 8 || number == 6){
                   return "The amount of snow this winter was(cm): " + number; }
               else {

                   return "The forecast snow is(cm)" + number;
               }

    }
public String theNumberIs(int number){
        if (number > 3 && number != 4 ){
            return "The number is greater than 3 and not equal to 4";
        }
        else if(number == 4){
            return "The number is equal to 4";
        }
        else if(number < 3){
            return "The number is lower than 3";
        }
    return "Altceva";
}
public String theXIs(int x){
    switch (x) {
        case 1:
            return "The number is:  1 !";
        case 2:
            return "The number is:  2 !";
        case 3:
            return "The number is:  3 !";
        case 4:
            return "The number is:  4 !";
        case 5:
            return "The number is:  5 !";
        case 6:
            return "The number is:  6 !";
        case 7:
            return "The number is:  7 !";
        case 8:
            return "The number is:  8 !";
        case 9:
            return "The number is:  9 !";

    } return "Another number";

    }

    public boolean isNumberEven(int x){
        if(x % 2 == 0){
            return true;
        }
    else {return false;}
    }
public boolean isEligibleToVote(int x){
        if(x >= 18){return true;}
        else {return false;}
}
public int higherNumberIs(int a, int b, int c){
        if (a > b && a >c){ return a;}
        else if (b > a && b > c){return b;}
        else if (c > a && c > b){return c;}
return 0;
}
}







