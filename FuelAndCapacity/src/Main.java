public class Main {
    public static void main(String[] args) {
        Car car=new Car(50);
        Car car1=new Car();
        car.addFuelAndPrice(20,30);
        car.addFuelAndPrice(14,13);
        car.removeFuelAndPrice();

        car.addFuelAndPrice(43,86);
        car.addFuelAndPrice(56,75);
        car.addFuelAndPrice(32,56);
        car.removeFuelAndPrice();
        car.addFuelAndPrice(46,32);
        car.addFuelAndPrice(75,34);


        car.show();


    }
}
