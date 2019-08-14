package exeception_design;

class VirtualPerson {
    private int tooCold;
    private int tooHot;
    VirtualPerson(int low, int high){
        tooCold = low;
        tooHot = high;
    }
    void drinkCoffee (CoffeeCup cup) throws TemperatureException{
        int temp = cup.getTemperature();
        if (temp < tooCold){
            throw new TemperatureException(temp, "Cold");
        } else if (temp > tooHot) {
            throw new TemperatureException(temp, "Hot");
        }
    }
}
