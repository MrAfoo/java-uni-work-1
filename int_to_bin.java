/*
Part (a) Write Java program that takes input an integer number and converts it into a  binary number   
                  TEST CASES (1) 32 = 10000   (2)   27 = 11011    (3)  26 = 11010
*/

import java.util.Scanner;
public class int_to_bin {
    public static String intToBinary(){ 
        int num;
        String binary = "";
        Scanner val = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        num = val.nextInt();
        while (num > 0){
            binary = (num % 2) + binary; 
            num /= 2; 
        }
        System.out.println("Binary representation: " + binary);
        val.close();
        return binary;
    }
    public static void main(String[] args) {
    intToBinary();
    }
}

