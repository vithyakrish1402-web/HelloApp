/**
 * HelloApp.java
 * UC7: Display "Hello" with multiple command-line arguments
 * using String.join() or default message
 */
public class HelloApp {

    public static void main(String[] args) {

        String name;

        // If no arguments → default
        if (args.length == 0) {
            name = "World";
        } else {
            // Join all arguments with ", "
            name = String.join(", ", args);
        }

        System.out.println("Hello, " + name + "!");
    }
}