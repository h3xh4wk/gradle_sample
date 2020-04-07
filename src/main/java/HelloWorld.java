/**
 * Hello World class is created for the purpose of the tutorial on Gradle and Groovy.
 * @author Administrator
 * @version 0.0.1
 */
public class HelloWorld {
    /**
     * Main method of the Hello World class
     * @param args An array of arguments of type String
     */
    public static void main(String[] args) {
        System.out.println("Hello, World! " + args[0]);
    }

    /**
     * A method created to return concatenation of passed arguments with only first 3 characters of the 2nd argument
     * @param arg1 An alphanumeric of type String
     * @param arg2 An alphanumeric of type String
     * @return Returns arg1 concatenated with 1st 3 characters of the second argument
     */
    public String method1(String arg1, String arg2) {
        return arg1 + arg2;
    }
}
