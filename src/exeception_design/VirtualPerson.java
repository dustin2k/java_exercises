package exeception_design;

class VirtualPerson {
    private int tooCold;
    private int tooHot;
    VirtualPerson(int low, int high) {
        tooCold = low;
        tooHot = high;
    }
    public void drinkCoffee(CoffeeCup cup) throws Throwable {
        // if (cup.getTemperature()<= tooCold) {
        //     throw new TemperatureException().initCause(new TooColdException());
        // }
        // if (cup.getTemperature() >= tooHot){
        //     throw new TemperatureException().initCause(new TooHotException());
        // }
        if (cup.getTemperature() <= tooCold) {
            throw new TooColdException().initCause(new Exception("Too Cold"));
        }
        if (cup.getTemperature() >= tooHot) {
            throw new TooHotException().initCause(new Exception("Too Hot"));
        }
    }
}