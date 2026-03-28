/**
 * HelloApp.java
 * UC3: Display "Hello" with command-line argument or default message
 */
public class HelloApp {

    public static void main(String[] args) {

        // Default value
        String name = "World";

        // Check if user provided argument
        if (args.length > 0) {
            name = args[0];
        }

        // Output
        System.out.println("Hello, " + name + "!");
    }
}