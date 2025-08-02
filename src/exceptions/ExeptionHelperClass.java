package exceptions;

import javax.naming.AuthenticationException;
import java.io.FileNotFoundException;
import java.net.BindException;

public class ExeptionHelperClass {

    static public void testExceptions()throws RuntimeException{
        try {
            // This will throw an IndexOutOfBoundsException
            outOfBoundsError();
        } catch (IndexOutOfBoundsException e) {
            //print stacktrace
            e.printStackTrace();
            runtimeError();
        }

    }
    public static void ExeptionByNum(int num)throws FileNotFoundException, BindException, AuthenticationException{
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

    static public void runtimeError() throws RuntimeException{
        throw new RuntimeException("A RunTimeException occurred");

    }
    static public void outOfBoundsError() throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException("An IndexOutOfBoundsException occurred");
    }
}
