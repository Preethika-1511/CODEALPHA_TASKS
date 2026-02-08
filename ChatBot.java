import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Chatbot: Hello! Type 'exit' to quit.");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.contains("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            } else if (input.contains("hello")) {
                System.out.println("Chatbot: Hi there!");
            } else if (input.contains("help")) {
                System.out.println("Chatbot: I can answer basic questions.");
            } else if (input.contains("java")) {
                System.out.println("Chatbot: Java is a powerful programming language.");
            } else {
                System.out.println("Chatbot: Sorry, I didn't understand.");
            }
        }
        sc.close();
    }
}