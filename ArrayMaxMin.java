package Phase1Projects;

import java.util.Scanner;

public class ArrayMaxMin {
    public static void main() {

        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;

        System.out.print("Enter array elements:");
        for(int i = 0; i<array.length; i++){
            array[i] = input.nextInt();
            if(array[i] >= max){
                max = array[i];
            } else if(array[i] <= min){
                min = array[i];
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}