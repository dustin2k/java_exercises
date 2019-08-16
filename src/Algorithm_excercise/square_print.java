package Algorithm_excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class square_print {
    // private int x;
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        do{
            try{
                x = input.nextInt();
                break;
            }
            catch(InputMismatchException e){
                input.next();
                System.out.print("Wrong, try again: ");
            }
        }while(true);
        System.out.print("Enter height: ");
        do{
            try{
                y = input.nextInt();
                break;
            }
            catch(InputMismatchException e){
                input.next();
                System.out.print("Wrong, try again: ");
            }
        }while(true);
        for(int i = 0; i < x; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                if(i == 0 || i == (y - 1) || j == 0 || j == (x - 1)){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
