package src;

public class Car2 {
    //fields
    public String make;
    public String model;
    private int year;
    //constructors
    public Car2 (String carMake, String carModel, int carYear) {
        this.make = carMake;
        this.model = carModel;
        this.year = carYear;
    }


    public Car2 () {}
    //MANI METHOD
    public static void main(String[] args) {
        Car2 car = new Car2();
        Car2 carEthan = new Car2("Hyundai", "VeraCruz", 2011);
        carEthan.toString();

    }
    /*
    public String toString(){
        return toString() + " new stuff\n";
    };
     */
}
