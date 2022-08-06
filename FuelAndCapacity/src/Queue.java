public class Queue {
    int items[] ;
    int size;
    int front, rear;

    Queue() {
        size=100;
        items=new int[size];
        front = -1;
        rear = -1;
    }
    Queue(int size) {
        items=new int[size];
        front = -1;
        rear = -1;
    }




    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }


    void enQueue(int element) {


        if (isFull()) {
            deQueue();
        }

        if (front == -1) {

                front = 0;
            }

            rear++;

            items[rear] = element;
        }


    int deQueue() {
        int element;

        // if queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {

            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }

            return (element);
        }
    }


}
