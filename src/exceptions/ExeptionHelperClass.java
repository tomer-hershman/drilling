package exceptions;

import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;

public class ExeptionHelperClass {

    public static void testExceptions() throws RuntimeException {
        RuntimeException runtimeException = new RuntimeException("A RuntimeException occurred");
        IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("An IndexOutOfBoundsException occurred");
        printstackTrace(indexOutOfBoundsException);
        throw runtimeException;
    }

    public static void ExeptionByNum(int num) throws FileNotFoundException, BindException, AuthenticationException {
        switch (num) {
            case 1:
                throw new FileNotFoundException("File not found exception occurred");
            case 2:
                throw new BindException("Bind exception occurred");
            case 3:
                throw new AuthenticationException("Authentication exception occurred");
            default:
        }
    }

    public static void ExeptionByNumCatcher(int num) {
        try {
            ExeptionByNum(num);

        } catch (FileNotFoundException e) {
            System.out.println(1);
        } catch (BindException e) {
            System.out.println(2);
        } catch (AuthenticationException e) {
            System.out.println(3);
        } finally {
            System.out.println("here");
            runtimeError();

        }
    }

    public static void runtimeError() throws RuntimeException {
        throw new RuntimeException("A RunTimeException occurred");

    }

    public static void outOfBoundsError() throws IndexOutOfBoundsException {
        throw new IndexOutOfBoundsException("An IndexOutOfBoundsException occurred");
    }

    public static void printUntil100() {
        int num;
        try {
            while (true) {
                System.out.println("Enter a number");
                num = scanner.nextInt();
                if (num == 45) {
                    throw new IllegalArgumentException("You entered 45, which is not allowed.");
                }
                if (num == 100) {
                    throw new RuntimeException("Number 100 is not allowed.");
                }

            }
        } catch (IllegalArgumentException e) {
            printUntil100();
        }
    }
}
