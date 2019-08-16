package Algorithm_excercise;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class random_number {
    public static void main(String[] args) {
        int x;
        int count = 1;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Enter a number between 10 and 99: ");
            do{
                try{
                    x = input.nextInt();
                    break;
                }
                catch(InputMismatchException e){
                    input.next();
                    System.out.print("Input a legit number: ");
                }
            }while(true);
        }while(x < 10 || x > 99);
        int n;
        n = ThreadLocalRandom.current().nextInt(10, 100);
        System.out.println(n);
        do{
            n = ThreadLocalRandom.current().nextInt((n < x)?(n + 1):x, (n < x)?(x + 1):n);
            System.out.println(n);
            count++;
        }while(n != x);
        System.out.println(count);
    }
}
