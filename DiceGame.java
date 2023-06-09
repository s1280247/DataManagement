import java.util.Scanner;
import java.util.Random;

class DiceGame {
    public static void main(String args[])
    {
        //Greeting
        System.out.println("What is your name?");
        System.out.print(">");

        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hello, "+name+"!");

        //Rolling the dice
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

        if(total > 7)System.out.println(name+" won!");
        else System.out.println(name+" lost.");
    }
}