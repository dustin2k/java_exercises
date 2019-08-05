package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    Fibonacci(){

    }

    static int[] fibonacci_list(int n){
        int[] num = new int[n];
        num[0] = 0;
        num[1] = 1;
        for(int i = 2; i < n; i++){
            num[i] = num[i - 1] + num[i - 2];
        }
        return num;
    }

    static int even_sum(int[] list){
        int total = 0;
        int n = list.length;
        for(int i = 1; i < n; i++){
            if(list[i] % 2 == 0) total += list[i];
        }
        return total;
    }

    static boolean isPerfectSquare(int n){
        int s = (int) Math.sqrt(n);
        return (s * s == n);
    }

    static boolean isFibonacci(int n){
        return (isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 *  n * n - 4));
    }

    public static void main (String[] args){
        int choice;
        boolean __continue = false;
        String __answer;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("What do you want to do:");
            System.out.println("1. List out the Fibonacci series and sum up all even numbers");
            System.out.println("2. Check if a number is a Fibonacci number or not");
            System.out.println("3. List all Fibonacci numbers between 1 and an input number");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println();
            while(choice > 3 || choice < 1){
                System.out.print("Wrong choice, try again: ");
                choice = sc.nextInt();
                System.out.println();
            }
            switch (choice){
                case 1 :
                {
                    System.out.print("Enter the length number: ");
                    int n = sc.nextInt();
                    int[] list = fibonacci_list(n);
                    System.out.println("Fibonacci series are:");
                    for(int i = 0; i < n; i++){
                        System.out.print(list[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Total of even numbers is: " + even_sum(list));
                    System.out.println();
                    break;
                }
                case 2 :
                {
                    System.out.print("Please enter the number to check: ");
                    int n = sc.nextInt();
                    System.out.println();
                    if(isFibonacci(n)) System.out.println(n + " is a Fibonacci number");
                    else System.out.println(n + " is not a Fibonacci number");
                    System.out.println();
                    break;
                }
                case 3 :
                {
                    System.out.print("Please enter your limit number: ");
                    int n = sc.nextInt();
                    System.out.println();
                    System.out.println("The Fibonacci series between 1 and " + n + " is:");
                    for(int i = 1; i < n; i++){
                        if(isFibonacci(i)) System.out.print(i + " ");
                    }
                    System.out.println();
                    System.out.println();
                    break;
                }
            }
            do {
                System.out.print("Do you want to continue (Yes/No): ");
                __answer = sc.next();
                System.out.println();
            } while (!__answer.toLowerCase().equals("y") && !__answer.toLowerCase().equals("yes") && !__answer.toLowerCase().equals("n") && !__answer.toLowerCase().equals("no"));
            if (__answer.toLowerCase().equals("y") || __answer.toLowerCase().equals("yes")) __continue = true;
            else __continue = false;
        } while (__continue);
        sc.close();
    }
}
