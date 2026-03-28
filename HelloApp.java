/**
 * HelloApp.java
 * UC4: Display "Hello" with multiple command-line arguments or default message
 */
public class HelloApp {

    public static void main(String[] args) {

        String name;

        // If no arguments → default
        if (args.length == 0) {
            name = "World";
        } else {
            // Join multiple names with comma + space
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}