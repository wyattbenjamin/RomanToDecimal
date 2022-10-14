/**
 * Simple I/O
 * @version 010.13.2022
 * @author 23benjamin
 */
public class RomanToDecimal {
    // This is the part of the program that is taking the value, computing it, and printing out the value. This part of the code does the "dirty work"
    public static int romanToDecimal(String roman) {
        int sum = 0;
        //len(roman)
        roman= roman.toUpperCase(); // standardizes all the code to be capital letters.
        //string.length()
        //array.length
        for (int i = 0; i < roman.length(); i++) { // Getting and computing all of the roman numeral values
            if (roman.charAt(i)== 'I')
                sum +=1;
            else if (roman.charAt(i)== 'V')
                sum +=5;
            else if (roman.charAt(i)== 'X')
                sum +=10;
            else if (roman.charAt(i)== 'L')
                sum +=50;
            else if (roman.charAt(i)== 'C')
                sum +=100;
            else if (roman.charAt(i)== 'D')
                sum +=500;
            else if (roman.charAt(i)== 'M')
                sum +=1000;
            else
                return -1;
        }
        if(roman.indexOf("IV") != -1)
            sum -=2;
        if(roman.indexOf("IX") != -1)
            sum -=2;
        if(roman.indexOf("XL") != -1)
            sum -=20;
        if(roman.indexOf("XC") != -1)
            sum -=20;
        if(roman.indexOf("CD") != -1)
            sum -=200;
        if(roman.indexOf("CM") != -1)
            sum -=200; // These are the exception cases. We need different code for these extraordinary characters
        return sum;




/**
 * Main method of class RomanToDecimal
 * @param args command line arguments, if needed
 */

        }
    public static void main(String[] args) {
     for(String roman : args) {
         int decimal= romanToDecimal(roman);
         if (decimal != -1)
             System.out.println("Input: " + roman + "=> output:" + decimal);
         else
             System.out.println("Input: " + roman + "=> output: invalid" );
         // Main method. This is also what the user sees. This "spits out" all the values (after figuring out if it is logical input)
     }
     }

    }




