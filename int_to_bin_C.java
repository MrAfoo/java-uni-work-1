/*
Part (a) Write Java program that takes input an integer number and converts it into a  binary number   
                  TEST CASES (1) 32 = 10000   (2)   27 = 11011    (3)  26 = 11010

Part (c) Write user defined Java functions to carry out calculation as mentioned in Part (a). This function should take an integer number as parameter, calculates its binary representation, stores these bits in a string and returns that string (that has its binary digit representation) as return value                  
*/

import java.util.Scanner;
public class int_to_bin_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        String binaryString = convertToBinary(number);
        System.out.println("Binary representation: " + binaryString);
        scanner.close();
    }

    public static String convertToBinary(int number) {
        if (number == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            binary.append(remainder);
            number /= 2;
        }
        return binary.reverse().toString();
    }
}