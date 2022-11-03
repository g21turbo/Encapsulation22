public class Car {

    //variables
    private int year;
    private String make;
    private String model;

    //Constructor
    public Car(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    //Getters & Setters to access private variables
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
