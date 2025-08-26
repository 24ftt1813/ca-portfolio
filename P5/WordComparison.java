import java.util.Scanner;

public class WordComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("Enter the First Word: ");
        String firstWord =input.nextLine();

        System.out.println("Enter the second Word: ");
        String secondWord =input.nextLine();

        boolean areSame = firstWord.equalsIgnoreCase(secondWord);


        System.out.println("Are both words the same? " + areSame);
    }
}
