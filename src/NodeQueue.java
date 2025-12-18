public class NodeQueue {

    TreatmentRequest data;
    NodeQueue next;

    public NodeQueue(TreatmentRequest request) {
        this.data = request;
        this.next = null;
    }
}


