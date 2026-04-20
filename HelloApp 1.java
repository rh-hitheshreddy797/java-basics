public class HelloApp {

    public static void main(String[] args) {
               if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message if no argument
            System.out.println("Hello, World!");
        }

    }
}