import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Why hello! What is your name?: ");
        String name = scanner.nextLine();
        
        String displayName = name.isBlank() ? "stranger" : name;
        System.out.printf("Welcome %s, and what is it you wish to ask?: ", displayName);
        String question = scanner.nextLine();
        while (question.isBlank()) {
            System.out.print("I cannot tell a fortune if no question is asked... so tell me, what is it you wish to know?:");
            question = scanner.nextLine();
        }
        int randomNumber = (int) (Math.random() * 8);
        String answer = "";

        switch (randomNumber) {
            case 0:
                answer = "It is certain";
                break;
            case 1:
                answer = "It is decidedly so";
                break;
            case 2:
                answer = "Reply hazy, try again.";
                break;
            case 3:
                answer = "Cannot predict now";
                break;
            case 4:
                answer = "Do not count on it";
                break;
            case 5:
                answer = "My sources say no";
                break;
            case 6:
                answer = "Outlook not so good";
                break;
            case 7:
                answer = "Signs point to yes";
                break;
            default:
                System.out.println("An unexpect number has occured");
                System.out.println(randomNumber);
                break;
        }
        System.out.printf("Question: %s Well here is my answer: %s\n", question, answer);
        scanner.close();
    }
}