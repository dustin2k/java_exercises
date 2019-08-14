package exeception_design;

import java.util.Random;

public class test_exception {
    public static void main(String[] args) {
        CoffeeCup cup = new CoffeeCup();
         try {
             VirtualPerson per = new VirtualPerson(50, 100);
             cup.setTemperature(95);
             per.drinkCoffee(cup);
             System.out.println("Perfect");
         }
         catch (TemperatureException e) {
             System.out.println(e.getMsg());
         }
    }
}
