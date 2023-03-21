package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters() {
         

         for (int i = 1; i <= 20; i++) {
            

            if (i % 2 == 0) //{
                System.out.print("Tweetle");
                 
                if (i % 4 == 0) {
                System.out.print("Beetle");}

                if (i % 6 == 0) {
                System.out.print("Poodle");}
            
            //}else{
                if (i%2 !=0 && i%4!=0 && i%6 !=0)
                System.out.print(i) ;
                //System.out.print(" "+i+" ");
                System.out.print (" ");
           // }
        }
        System.out.println() ;
 }
            
 

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
public static void phoneKeypad( String str ) {
   
    for(int i = 0; i < str.length(); i++) {
        String digit = "";
        switch (str.toUpperCase().charAt(i)){
            case 'A': case 'B': case 'C': 
                    digit += "2"; 
                    break;
                case 'D': case 'E': case 'F': 
                    digit += "3"; 
                    break;    
                case 'G': case 'H': case 'I': 
                    digit += "4"; 
                    break;
                case 'J': case 'K': case 'L': 
                    digit += "5"; 
                    break;
                case 'M': case 'N': case 'O': 
                    digit += "6"; 
                    break;
                case 'P': case 'Q': case 'R': case 'S': 
                    digit += "7"; 
                    break;
                case 'T': case 'U': case 'V': 
                    digit += "8"; 
                    break;
                case 'W': case 'X': case 'Y': case 'Z': 
                    digit += "9"; 
                    break;
        }
        System.out.print(digit);
    } 
    System.out.println();   
} 
 
    public static void main(String [] args) {
        

        twisters();
        System.out.println();

        Scanner in = new Scanner(System.in);
        String str;
        /* Write your code here */
        System.out.println("Enter a string: ");
        str = in.nextLine();
       //call method twisters()
       //prompt user to enter a string 
       
       //call method phoneKeypad(string)
       phoneKeypad(str);
       in.close();

    }

}
