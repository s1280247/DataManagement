// import java.util.Scanner;
import java.util.Random;

class DiceGame {
    public static void main(String args[])
    {
       // System.out.print("Enter the number of dice: ");

        // Scanner input = new Scanner(System.in);
        // int numberOfDice = input.nextInt();

        Random ranNum = new Random();

        System.out.println("Rolling dice...");
        int total = 0;
        int randomNumber = 0;

        for (int i = 1; i < 3; i++) {

            randomNumber = ranNum.nextInt(6) + 1;
            total = total + randomNumber;
            System.out.print("Dice"+i+": ");
            System.out.println(randomNumber);
        }

        System.out.println("Total value: " + total);
    }
}
