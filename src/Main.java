public class Main {

    // Encapsulation - attributes of a class will be hidden or private,
    //                Can be accessed on through methods (getters & setters)
    //                You should make attributes private if you don;t have a reason
    //                to make them public.


    public static void main(String[] args) {

        Car car = new Car(2022, "Dodge", "Challenger");
        System.out.println(car.getYear());
        System.out.println(car.getMake());
        System.out.println(car.getModel());

        System.out.println("\n");

        Car car1 = new Car(2022, "Ford", "Mustang");
        car1.setYear(2021);
        car1.setMake("Dodge");
        car1.setModel("Ram 1500 4x4");
        System.out.println(car1.getYear() + " " + car1.getMake() + " " + car1.getModel());


    }


}
