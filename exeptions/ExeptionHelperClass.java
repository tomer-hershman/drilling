package exeptions;

public class ExeptionHelperClass {
    static void error(){
        throw new RuntimeException("A RunTimeException occurred");

    }
    static void error()throws IndexOutOfBoundsException, RuntimeException {
        throw new RuntimeException("A RunTimeException occurred");
        throw new IndexOutOfBoundsException("An IndexOutOfBoundsException occurred");
    }
}
