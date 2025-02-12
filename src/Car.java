package src;
//Add 3 appropriate data fields and provide appropriate methods for the car class, demonstrate your methods
public class Car {
    //Fields(data, state of your object)
    private String make;
    private String model;
    private final int year;
    private int mileage;

    private String color;
    private String engine;
    private String transmission;

    //methods(behavior: how we modify & access data fields)
    //construct
    public Car (String make, String model, int year, int mileage, String color, String engine, String transmission) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
    }
    //setters
    public void setMake (String make) {
        this.make = make;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public void setEngine (String engine) {
        this.engine = engine;
    }
    public void setTransmission (String transmission) {
        this.transmission = transmission;
    }

    //getters
    public String getMake () {
        return make;
    }
    public String getModel () {
        return model;
    }
    public int getYear () {
        return year;
    }
    public int getMileage() {
        return mileage;
    }
    public String getColor (){
        return color;
    }
    public String getEngine () {
        return  engine;
    }
    public String getTransmission () {
        return transmission;
    }

    public void drive (int newMiles){
           if(mileage >= newMiles){
               mileage = newMiles;
           } else {
               System.out.println("Can't reverse miles!");
           }
    }
    public void printCar () {
        System.out.println("The car is a " + getYear() + " " + getMake() + " " + getModel() + "." + " The car is " + getColor() + " and has a " + getEngine() + " engine with a " + getTransmission() + " transmission with " + getMileage() + " miles.");
    }

    public static void main(String[] args) {
        Car car = new Car("Chevy", "Camaro", 2006, 180760, "blue", "v8", "manual");
        car.printCar();
    }
}
