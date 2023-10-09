// Main.java
public class Main {
    public static void main(String[] args) {
        Message message = new BasicMessage("Hello, world!");

        // Decorate the message
        message = new UppercaseDecorator(message);
        message = new ExclamationDecorator(message);

        // Display the decorated message
        System.out.println(message.getContent());
    }
}
