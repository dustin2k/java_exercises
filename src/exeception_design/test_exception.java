package exeception_design;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class test_exception {
    public static void main(String[] args) {
        // CoffeeCup cup = new CoffeeCup();
        //  try {
        //      VirtualPerson per = new VirtualPerson(50, 100);
        //      cup.setTemperature(95);
        //      per.drinkCoffee(cup);
        //      System.out.println("Perfect");
        //  }
        //  catch (TemperatureException e) {
        //      System.out.println(e.getMsg());
        //  }
        String choice;
        Scanner input = new Scanner(System.in);
        do {
            int low;
            int high;
            System.out.print("Enter the low threshold temperature: ");
            do {
                try {
                    low = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.print("Wrong data, input again: ");
                }
            } while (true);
            System.out.print("Enter the high threshold temperature: ");
            do {
                try {
                    high = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.print("Wrong data, input again: ");
                }
            } while (true);
            CoffeeCup cup = new CoffeeCup();
            int temp;
            System.out.print("Enter coffee cup's temperature: ");
            do {
                try {
                    temp = input.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    input.nextLine();
                    System.out.print("Wrong data, input again: ");
                }
            } while (true);
            try {
                VirtualPerson per = new VirtualPerson(low, high);
                cup.setTemperature(temp);
                per.drinkCoffee(cup);
                System.out.println("Perfect");
            } catch (TemperatureException e) {
                System.out.println(e.getMsg());
            }
                do {
                    System.out.println("Continue (yes/no): ");
                    choice = input.next();
                } while (!choice.toLowerCase().equals("yes") && !choice.toLowerCase().equals("y") && !choice.toLowerCase().equals("no") && !choice.toLowerCase().equals("n"));

        } while (choice.toLowerCase().equals("yes") || choice.toLowerCase().equals("y"));
        input.close();
    }
}