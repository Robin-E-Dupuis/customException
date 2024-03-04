import java.util.Scanner;

/**
 *
 * @author Robin Dupuis
 */
public class CustomException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Do you love me ? yes or no? : ");
            String answer = input.next();

            check(answer);
        } catch (loveException e) {
            System.out.println(e);
        }
    }

    public static class loveException extends Exception {

        loveException(String message) {
            super(message);
        }
    }

    public static void check(String answer) throws loveException {
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
            System.out.println("I love you too.");
        } else {
            throw new loveException("Stop lying you love me");
        }
    }
}
