import java.util.Scanner;

/**
 * Created by Eugene Karpenko on 15.04.2015.
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 9) + 1;
        int attempts = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадай число от 1 до 10");

        int input;
        while ((input = scanner.nextInt()) != randomNumber) {
            System.out.println("Увы, моё число " + (input > randomNumber ? "меньше" : "больше"));
            attempts++;
        }

        System.out.println("Угадал :(");
        System.out.println("Всего попыток: " + attempts);
    }
}
