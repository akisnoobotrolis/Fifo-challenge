public class PriceQueue extends Queue{


    public PriceQueue() {
        size=100;
        items=new int[size];
        front = -1;
        rear = -1;
    }

    public PriceQueue(int size) {
        items=new int[size];
        front = -1;
        rear = -1;
    }

    void displayPrice() {
        int i;
        if (isEmpty()) {
            System.out.println("No money spent");
        }
        else {


            int rearReversed=rear-front+1;
            for (i = front; i <= rear; i++,rearReversed--)
                System.out.print(rearReversed+ " Gas Station " +items[i]+ " Euros worth of fuel\n");

        }
    }
}
