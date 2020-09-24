package com.company;

public class LogicalOperations {


    public int verifyHigherNumber(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public String verifyText(String textInput) {
        if (textInput.equals("a")) {
            return "a";
        } else {
            return "try some more";

        }
    }


    //public String textAndNumber(String input , int n){


    //  if input.equals("FastTrack ") && n<= 3{
    //       return input + n;
    // }
    //else if !input.equals("FastTrack ")&& n>= 4 {
    //return  n + input;
    // }

    public String forecastSnow(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {

            return "The forecast snow is(cm)" + number;
        }

    }

    public String theNumberIs(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        }
        return "Altceva";
    }

    public String theXIs(int x) {
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

        }
        return "Another number";

    }

    public boolean isNumberEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int x) {
        if (x >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int higherNumberIs(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (c > a && c > b) {
            return c;
        }
        return 0;
    }

    //tema 12
// Problema 1
    public void startNumberMethod(int startNumber) {
        for (int i = startNumber; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //Problema 2
    public void startNumberMethod1(int startNumber) {
        for (int i = startNumber; i <= -100; i--) {
            System.out.println(i);
        }
    }

    //Problema 3
    public void startNumberEndNumber(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.println(i);
        }
    }

    //Problema 4
    public void lowerToHigher(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        } else if (b < a) {
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        }
    }

    //Problema 5
    public void pNr(int nr) {
        for (int i = 1; i <= nr; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Problema 6
    public void impNr(int nr) {

        for (int i = 1; i <= nr; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    //Problema 7/8
    public void sumAndAverage(int startNumber, int endNumber) {
        int sum = 0;
        float count = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum = sum + i;
            count++;
            System.out.println("Sum is " + sum);
            System.out.println("Average is " + (sum / count));
        }
    }

    public void pattern(int x) {
        for (int i = x; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.println("\t" + "*" + " ");
            }
            System.out.println();
        }
    }

    //LOOP
    //Problema 1
    public void nrToHundred(int nr) {
        int i = nr;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }

    //Problema 2
    public void nrToNegativeHundred(int nr) {
        int j = nr;
        do {
            System.out.println(j);
            j--;
        } while (j >= -100);
    }

    //Problema 3
    public void firstNumberSecondNumber(int first, int second) {
        int i = first;

        do {
            System.out.println(i);
            i++;
        } while (i <= second);
    }

    //Problema 4
    public void lowToHigh(int low, int high) {
        int i = low;
        if (low < high) {
            do {
                System.out.println(i);
                i++;

            } while (i <= high);
        } else {
            do {
                System.out.println(i);
                i++;
            } while (i <= low);
        }
    }

    //Problema 5
    public void evenNr(int nr) {
        int i = 1;
        if (i % 2 == 0) {
            do {
                System.out.println(i);
                i++;
            } while (i <= nr);
        }
    }

    //Problema 6
    public void oddNr(int nr) {
        int i = 1;
        if (i % 2 == 1) {
            do {
                System.out.println(i);
                i++;
            } while (i <= nr);
        }
    }

    //Problema 7
    public void doWhileSumAndAverage(int start, int end) {
        int sum = 0;
        float count = 0;
        int i = start;
        do {
            System.out.println(sum);
            System.out.println(sum / count);
            i++;
            sum = sum + i;
            count++;
        } while (i <= end);

    }

    //Problema 8
    public void divisibility(int a, int b) {
        int sum = 0;
        float count = 0;
        int i = a;
        do {
            System.out.println(sum / count);
            i++;
            if (i % 7 == 0) ;
            sum = sum + i;
            count++;
        } while (i <= b);
    }

    //Problema 9
    public void Fibonacci(int count) {
        int a = 0;
        int b = 1;
        int i = 1;
        System.out.println(a);
        System.out.println(b);

        do {
            System.out.println(i);
            i = a + b;
            a = b;
            b = i;
            i++;
        } while (i <= count);

    }


//Problema 10

    public void cozaLozaWoza(int x, int y) {
        int i = x;


        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }

    //Tema 13
    //Problema 2
    public int[] getArrayNumber(int maxValue) {
        int[] myArray = new int[maxValue];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.println(myArray[i]);
        }
        return myArray;
    }

    //Problema 3
    public int[] evenArrayList(int maxValue) {
        int[] evenArray = new int[maxValue];
        for (int i = 0; i < evenArray.length; i++) {
            evenArray[i] = i + 1;
            if (evenArray[i] % 2 == 0) {
                System.out.println(evenArray[i]);
            }
        }
        return evenArray;
    }

//Problema 4

    public float averageArray(int[] myArray) {
        float sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        return sum / myArray.length;
    }

    //Problema 5
    public boolean findString(String[] findStringArray,String textInput) {

        for (String i : findStringArray) {
            if (findStringArray.equals(textInput))
                return true;

        } return false;

    }

    // }return "value";
//Problema 6
   public int valuePosition(int[] arr, int x) {
       for ( int i = 0; i < arr.length; i++)
          if (arr[i] == x){
    return i;
          }
       return x;
   }




        //Problema 7


   //Problema 8
   //public int[] listMinusOne(int maxValue, int x ) {
      // int[] myArray = new int[maxValue];
       //for (int i = 0; i<myArray.length;i++) {
         //  myArray[i] = i + 1;
           //if (myArray[i]!=x){
             //  System.out.println(myArray[i]);}
       //}
       //return myArray;
  // }
//Problema 9

    public int secondSmallestValue(int array[]) {
        int first, second;

        first = second = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i ++)
        {
            if (array[i] < first)
            {
                second = first;
                first = array[i];
            }

            else if (array[i] < second && array[i] != first)
                second = array[i];

        }return second;


    }

//Problema 10

}
}





























