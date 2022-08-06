public class FuelQueue extends Queue{


    public FuelQueue(int size) {
            items=new int[size];
            front = -1;
            rear = -1;
        }
    public FuelQueue() {
        size=100;
        items=new int[size];
        front = -1;
        rear = -1;
    }


    void displayFuel() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Tank");
        }
        else {


            int frontFromOne=front-front+1;
            for (i = front; i <= rear; i++,frontFromOne++)
                System.out.print(frontFromOne+ " Gas Station " +items[i]+ " liters of fuel\n ");



        }
    }
}
