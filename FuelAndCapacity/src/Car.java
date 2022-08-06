public class Car {
    PriceQueue price;
    FuelQueue fuel;



    Car(){
        price=new PriceQueue();
        fuel= new FuelQueue();
    }
    Car(int element){
        price=new PriceQueue(element);
        fuel= new FuelQueue(element);
    }



    void addFuelAndPrice(int fuel, int price){
        this.price.enQueue(price);
        this.fuel.enQueue(fuel);
    }
    void removeFuelAndPrice(){
        this.price.deQueue();
        this.fuel.deQueue();
    }

    void show(){
        price.displayPrice();
        System.out.println("\n");
        fuel.displayFuel();
    }
}
