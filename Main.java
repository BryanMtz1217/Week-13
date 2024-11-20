public class Main {
    public static void main(String[] args) {
        // Creates Car object
        Car myCar = new Car(120, 50.5, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();

        // Creates Bicycle object
        Bicycle myBike = new Bicycle(15, 0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();
    }
}
