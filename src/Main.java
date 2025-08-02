import exceptions.ExeptionHelperClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            ExeptionHelperClass.testExceptions();
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
        try {
            int[] array = new int[]{5, 10, 15, 20, 25};
            System.out.println(array[10]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("an error occurred: " + e.getMessage());
        }

        int num = 0;
        try {
            while (num != 100) {
                System.out.println("Enter a number");
                num = scanner.nextInt();
                if (num == 45){
                    throw new IllegalArgumentException("You entered 45, which is not allowed.");
                }
                if(num == 100){
                    throw  new RuntimeException("Number 100 is not allowed.");
                }

            }
        }
        catch (IllegalArgumentException e) {

        }

    }

}
