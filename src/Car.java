package src;
//Add 3 appropriate data fields and provide appropriate methods for the car class, demonstrate your methods
public class Car {
    //Fields(data, state of your object)
    private String make;
    private String model;
    private int year;
    private int mileage;

    private String color;
    private String engine;
    private String transmission;
    //methods(behavior: how we modify & access data fields)
    //constructors
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
    //All the attributes should have the ability to be changed because what if the wrong value for that attribute is accidentally set
    public void setMake (String make) {
        this.make = make;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public void setYear (int year) {
        this.year = year;
    }
    public void setEngine (String engine) {
        this.engine = engine;
    }
    public void setTransmission (String transmission) {
        this.transmission = transmission;
    }
    //getters
    //all the getters are useful to have especially when trying to print information about that object
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

    //whenever you drive you add miles to your total mileage, your total mileage cant go down
    public void drive (int miles){
           if(miles < 0) {
               System.out.println("Can't reverse miles!");
           } else {
               this.mileage += miles;
               System.out.println(miles + " miles added");
           }
    }
    //prints all known attributes of the car
    public void printCar () {
        System.out.println("The car is a " + getYear() + " " + getMake() + " " + getModel() + "." + " The car is " + getColor() + " and has a " + getEngine() + " engine with a " + getTransmission() + " transmission with " + getMileage() + " miles.");
    }
    //MAIN Method
    public static void main(String[] args) {
        Car car = new Car("Chevy", "Camaro", 2006, 180760, "blue", "v8", "manual");
        Car car1 = new Car("Honda", "Beat", 2000, 76590, "white", "v6", "automatic");
        car.printCar();
        car1.printCar();

        car.drive(100);
        car.setColor("red");
        car.setMake("Dodge");
        car.setModel("Charger");
        car.printCar();
    }
}
