public class TreatmentQueueTest {
    public static void main(String[] args) {
        TreatmentQueue queue = new TreatmentQueue();

        // Add 8 treatment requests
        queue.enQueue(new TreatmentRequest(1));
        queue.enQueue(new TreatmentRequest(2));
        queue.enQueue(new TreatmentRequest(3));
        queue.enQueue(new TreatmentRequest(4));
        queue.enQueue(new TreatmentRequest(5));
        queue.enQueue(new TreatmentRequest(6));
        queue.enQueue(new TreatmentRequest(7));
        queue.enQueue(new TreatmentRequest(8));

        //  Process (dequeue) 3 requests.
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        //Print the remaining queue.
        System.out.println("The remaining queue.");
        queue.printQueue();

    }
}
