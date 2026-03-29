/*
Part (a) Write Java program that takes input an integer number and converts it into a  binary number   
                  TEST CASES (1) 32 = 10000   (2)   27 = 11011    (3)  26 = 11010

 Part (b) Write user defined Java functions to carry out calculation as mentioned in Part (a). This function should take an integer number as parameter, calculates its binary representation, stores it in an integer array and returns that array of integers (that contains its binary digits) as return value                 
*/

import java.util.Scanner;
public class int_to_bin_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        
        int[] binaryArray = convertToBinary(number);
        
        System.out.print("Binary representation: ");
        for (int bit : binaryArray) {
            System.out.print(bit);
        }
    }
    
    public static int[] convertToBinary(int number) {
        StringBuilder binaryString = new StringBuilder();
        
        while (number > 0) {
            int remainder = number % 2;
            binaryString.insert(0, remainder);
            number /= 2;
        }
        
        int[] binaryArray = new int[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            binaryArray[i] = Character.getNumericValue(binaryString.charAt(i));
        }
        
        return binaryArray;
    }
}

