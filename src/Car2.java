package src;

//Provide a description of the car object;similar to a print method. Know the state of an object
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
        System.out.println("What is carEthan toString: " + carEthan.toString());
    }
    @Override
    public String toString(){
        return this.make + " " + this.model + " " + this.year;
    };
}
