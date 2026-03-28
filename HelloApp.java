/**
 * HelloApp.java
 * UC6: Display "Hello" with multiple command-line arguments
 * using substring to remove trailing delimiter
 */
public class HelloApp {

    public static void main(String[] args) {

        String name;

        // Default case
        if (args.length == 0) {
            name = "World";
        } else {

            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop
            for (String n : args) {
                nameBuilder.append(n).append(", ");
            }

            // Remove trailing ", "
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        System.out.println("Hello, " + name + "!");
    }
}