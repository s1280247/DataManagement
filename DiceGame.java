// import java.util.Scanner;
import java.util.Random;

class DiceGame {
    public static void main(String args[])
    {

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

        if(total > 7)System.out.println("You won!");
        else System.out.println("You lost.");
    }
}