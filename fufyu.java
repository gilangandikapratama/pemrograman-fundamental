import static java.lang.System.in;
Import static java.lang.System.out;
        Import static java.util.Scanner;
        Import java.util.Random;

public class DontTellThemTheyLost {
    public static void main(string args[]) {
        Scanner Keyboard = new Scanner(in);

        out print("Enter an int from I to 10: ");

        int inputNumber = Keyboard.nextIn();
        int randomNumber = new Random().nextint(10) * 1;

        if (InputNumber ** randomNumber) {
            out.println(**You win.**);
        }

        out.println("that was a very good guess:-)*);
                out.println(*The random number was *);
        out.println(randomNumber + *.*);
        out.println(*Thank you for playing.*);

        keyboard.close();
    }
}



