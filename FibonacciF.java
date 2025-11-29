package Phase1Projects;

import java.util.Scanner;

public class FibonacciF {

    public static int fibonacci(int n) {
        if(n==1 || n==0) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static int factorial(int n) {
        int result = 1;
        for(int i=0;i<n;i++) {
            result = result * (n-i);
        }
        return result;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter fibonacci number: ");
        int n = input.nextInt();
        System.out.println("Result: " + fibonacci(n));
        System.out.print("Enter factorial number: ");
        int f = input.nextInt();
        System.out.println("Result: " + factorial(f));
    }
}