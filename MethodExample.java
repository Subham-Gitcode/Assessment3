package assessment3;

public class MethodExample {
   // Method with no parameters and no return value
   public void greet() {
        System.out.println("Hello! Welcome to MethodExamples.");
    }

    // Method with parameters and no return value
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method with parameters and a return value
    public int addNumbers(int a, int b) {
        return a + b;
    }

    // Method with no parameters and a return value
    public String getGreeting() {
        return "Welcome!";
    }

    public static void main(String[] args) {
        MethodExample example = new MethodExample();

        // Calling a method with no parameters and no return value
        example.greet();

        // Calling a method with parameters and no return value
        example.sayHello("John");

        // Calling a method with parameters and a return value
        int sum = example.addNumbers(5, 3);
        System.out.println("Sum: " + sum);

        // Calling a method with no parameters and a return value
        String greeting = example.getGreeting();
        System.out.println("Greeting: " + greeting);
    } 
}
