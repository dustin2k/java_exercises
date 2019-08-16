package Algorithm_excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        do{
            try{
                x = input.nextInt();
                break;
            }
            catch(InputMismatchException e){
                input.next();
                System.out.print("Error, try again: ");
            }
        }while(true);
        for(int i = 1; i <= x; i++){
            // for(int j = 0; j < i; j ++){
            //     System.out.print(j + 1);
            // }
            // for(int g = (i - 1); g > 0; g--){
            //     System.out.print(g);
            // }
            for(int j = 1; j < x; j++){
                if(j <= (x - i)) System.out.print(" ");
                else System.out.print(j + i - x);
            }
            System.out.print(i);
            for(int j = (x + 1); j < (x * 2); j++){
                if(j >= (x + i)) System.out.print(" ");
                else System.out.print(x + i - j);
            }
            System.out.println();
        }
        input.close();
    }
}
