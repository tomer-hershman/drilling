import exceptions.ExeptionHelperClass;
import jdk.internal.org.jline.utils.ExecHelper;

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

        ExeptionHelperClass.printUntil100();

    }

}
