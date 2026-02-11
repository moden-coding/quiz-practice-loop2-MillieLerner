/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. Keep track of the highest and lowest test score. When the user enters '-1', print out
 *  the highest and lowest scores with an appropriate message i.e. "The high score was ...."
 */


import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int largest=0;
        int smallest=0;
        while(true){
            System.out.println("What is the test score?");
            int number=Integer.valueOf(scanner.nextLine());
            if(number==-1){
                break;
            } else if (number>=largest){
                    largest=number;
                } else{
                    smallest=number;
                }
                }
            System.out.println("The high score was "+largest+". The lowest score was "+smallest);
                }
            }
        


   

        
// public static int smallest(int number1, int number2) {
//         if (number1 > number2) {
//             return number2;
//         } else {
//             return number1;

//         }