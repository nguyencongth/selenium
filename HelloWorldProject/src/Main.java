public class Main {
    static String classLevelVariable = "This is a class level variable";
    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        Greeting greeting = new Greeting();
        greeting.hello();
        Messenger messenger = new Messenger();
        messenger.sendMessage("I'm Thành");

         */
        String greeting = "Hello world";
        int number = 5;
        boolean isJavaRun = true;

        System.out.println(greeting);
        System.out.println(number);
        System.out.println(isJavaRun);

        displayMessage("First custom message");

        System.out.println(classLevelVariable);

        String name = "Thành";
        int age = 23;

        printName(name);
        printAge(age);

        int result = addNumber(1, 2);

        System.out.println(result);

        Calculator calculator = new Calculator();
        int sum = calculator.add(2, 3);
        System.out.println(sum);

        int difference = calculator.subtract(3,1);
        System.out.println(difference);

    }
    public static void displayMessage(String message) {
        String localMessage = "This is a local variable";
        System.out.println(localMessage);
        System.out.println("Message: " + classLevelVariable);
        System.out.println(message);

    }

    public static void printName(String name) {
        System.out.println("Hello, " + name);
    }

    public static void printAge(int age) {
        System.out.println("I'm " + age + "year old");
    }

    public static int addNumber(int a, int b) {
        return a + b;
    }
}
