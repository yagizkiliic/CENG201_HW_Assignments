public class DischargeStack {

    NodeStack top;
    int counter;

    public DischargeStack() {
        this.top = null;
        this.counter = 0;
    }

    public void push(DischargeRecord record) {  //Add a discharge record.
        NodeStack newNode = new NodeStack(record);
        if(counter == 0) {
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        counter++;
    }

    public void pop(){  // Delete the last record from the DischargeStack.
        if(top == null){
            System.out.println("Empty list.");
        }
        else{
            top = top.next;
            counter--;
        }
    }


    public DischargeRecord peek() { //View the most recent discharge without removing it.
        if (top == null) {
            return null;
        }
        return top.data;
    }

    void printStack() { //Print all discharge records.
        if (counter == 0) {
            System.out.println("Stack is empty");
        } else {
            NodeStack temp = top;
            while (temp!=null) {
                System.out.println("ID: " + temp.data.patientId +" ->");
                temp = temp.next;
            }
        }
    }


}







