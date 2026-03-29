// find factorial of a number

import java.util.Scanner;
public class factorial {
    public static int fact(){ // function to find factorial
        int num;
        int fact = 1;
        Scanner val = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = val.nextInt();
        for (int i=1; i<=num; i ++){
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
        val.close();
        return fact;    
    }
    public static void main(String[] args) {
    fact();
    }
}