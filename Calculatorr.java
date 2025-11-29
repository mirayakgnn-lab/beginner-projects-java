package Phase1Projects;

import java.util.Scanner;

public class Calculatorr {

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String expr =  input.nextLine();
        String[] parts =  expr.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        char c = parts[1].charAt(0);

        switch(c) {
            case '+':
                System.out.println("= " + sum(a, b));
                break;
            case '-':
                System.out.println("= " + sub(a, b));
                break;
            case '*':
                System.out.println("= " + mul(a, b));
                break;
            case 'x':
                System.out.println("= " + mul(a, b));
                //Same result.
                break;
            case '/':
                System.out.println("= " + div(a, b));
                break;
            default:
                System.out.println("We can't solve this yet. :(");
        }
    }
}