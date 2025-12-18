public class TreatmentQueue {
    NodeQueue front;
    NodeQueue rear;
    int size;

    public TreatmentQueue() {
        this.size = 0;
        this.front = null;
        this.rear = null;
    }

    void enQueue(TreatmentRequest request) { //Add a new treatment request to the queue.
        NodeQueue newNode = new NodeQueue(request);
        if (rear == null) { // If the queue is empty, front and rear = newNode
            front = newNode;
            rear = newNode;
        } else { //add newNode at the end
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    TreatmentRequest deQueue() { //Remove and return the first treatment request.
        if (front == null) { // If the queue is empty, there is nothing
            return null;
        }
        TreatmentRequest request = front.data;
        front = front.next;// delete the first node
        if (front == null) { // checking
            rear = null;
        }
        size--;
        return request;
    }

    int Size() { //Return the number of requests in the queue.
        return size;
    }

    void printQueue() { //Print all requests in the queue.
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }
        NodeQueue temp = front;
        while (temp!=null) {
            System.out.print("Patient ID: "+temp.data.patientId+" Arrival Time: "+temp.data.arrivalTime+" -> ");
            temp = temp.next;
        }
    }
}
