import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int)(System.currentTimeMillis() % 10000) % 3;

        System.out.println("Enter 0 for Scissor, 1 for Rock, 2 for Paper: ");
        int user = input.nextInt();

        System.out.println("Computer chose: ");
        switch (computer) {
            case 0: System.out.println("Scissor"); break;
            case 1: System.out.println("Rock"); break;
            case 2: System.out.println("Paper"); break;
    }
        System.out.println("You chose: ");
        switch (user) {
            case 0: System.out.println("Scissor"); break;
            case 1: System.out.println("Rock"); break;
            case 2: System.out.println("Paper"); break;
    }

    if (user == computer)
        System.out.println("It's a draw!");

    if (user == 0 && computer == 2)
        System.out.println("You win! Scissor cuts Paper.");
    if (user == 0 && computer == 1)
        System.out.println("You lose! Rock cuts Scissor.");
        
    if (user == 1 && computer == 0)
        System.out.println("You win! Rock knocks Scissor.");
    if (user == 1 && computer == 2)
        System.out.println("You lose! Paper wraps Rock.");

    if (user == 2 && computer == 1)
        System.out.println("You win! Paper wraps Rock.");
    if (user == 2 && computer == 0)
        System.out.println("You lose! Scissor cuts Paper.");
}
}