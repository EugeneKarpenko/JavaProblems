import java.util.Scanner;

/**
 * Created by Eugene Karpenko on 15.04.2015.
 */
public class AI {

    private static final double EPSILON = 0.0001;

    public static void main(String[] args) {
        System.out.println("Загадай число. \n Сколько разрядов в твоём числе?");
        Scanner scanner = new Scanner(System.in);
        int digits = scanner.nextInt();
        double minNumber = 0;
        double maxNumber = Math.pow(10, digits);
        double middle;
        int attempts = 1;
        String answer;

        while (true)
        {
            middle = Math.floor((maxNumber + minNumber) / 2);
            System.out.println("Твоё число больше " + middle + "? (y/n)");
            answer = scanner.next();
            if (answer.equals("y")) {
                minNumber = middle + 1;
            }
            else if (answer.equals("n")) {
                maxNumber = middle;
            }

            if (maxNumber - minNumber < EPSILON) {
                System.out.println("Твоё число " + minNumber + " :) \n Я угадал за " + attempts + " попыток");
                return;
            }

            attempts++;
        }
    }
}
