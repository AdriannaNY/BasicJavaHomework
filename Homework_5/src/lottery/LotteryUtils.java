package lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LotteryUtils {

    public static void Play() {

        /**
         * Метод для создания основной логики лотереи:
         * 1. Создаем 5 выигрышных номеров (рандомных) от 1 до 50
         * 2. Создаем ввод игроком своих 5 номеров от 1 до 50
         * 3. Сравниваем с выигрышными номерами и выводим результат (победа или проигрыш, значения совпавших выигрышных номеров)
         */
        

        List<Integer> winningNum = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            while (true) {
                int winning = random.nextInt(50) + 1;
                if (!winningNum.contains(winning)) {
                    winningNum.add(winning);
                    break;
                }
            }
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("LET'S START OUR LOTTERY GAME!");
        System.out.println("Please enter below the 5 numbers you want to choose between 1 and 50");
        List<Integer> guessedNum = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("The numbers you have chosen are: "
                    + guessedNum);
            System.out.print("Enter a number between 1-50: ");
            while (true) {
                try {
                    String numberString = scan.nextLine();
                    int number = Integer.parseInt(numberString);
                    if (number >= 1 && number <= 50) {
                        guessedNum.add(number);
                        break;
                    } else {
                        System.out.println(number +
                                " is not between 1 and 50. Please try again.");
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("That's not a number. " +
                            "Please try again.");
                }
            }
        }


        System.out.println("\nThe winning numbers were: " + winningNum);
        System.out.println("Your numbers are: " + guessedNum);

        guessedNum.retainAll(winningNum);
        System.out.println("Your matched numbers are: " + guessedNum);

        if (guessedNum.containsAll(winningNum)) {
            System.out.println(" YOU WON !!!");
        } else {
            System.out.println("Sorry, you lost.");
        }

        scan.close();
    }
}



