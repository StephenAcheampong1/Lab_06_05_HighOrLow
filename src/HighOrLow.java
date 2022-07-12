import java.util.Random;
import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        Random generator = new Random();

        int guessedNumber = 0;
        int val = generator.nextInt(10) + 1;
        System.out.println("Pick a number between 1 and 10:");
        guessedNumber = in.nextInt();

        if (guessedNumber > val)
        {
            System.out.println("The number you picked was higher than the generated number which is " +val);
        }
        else if (guessedNumber < val)
        {
            System.out.println("The number you picked was lower than the generated number which is " +val);
        }
        else if (guessedNumber == val)
        {
            System.out.println("Right on the Money! The random number was " +val);
        }
    }
}
