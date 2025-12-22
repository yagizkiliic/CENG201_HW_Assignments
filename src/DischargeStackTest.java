public class DischargeStackTest {
    public static void main(String[] args) {

        DischargeStack stack = new DischargeStack();

        // Add 5 discharge records.
        stack.push(new DischargeRecord(1));
        stack.push(new DischargeRecord(2));
        stack.push(new DischargeRecord(3));
        stack.push(new DischargeRecord(4));
        stack.push(new DischargeRecord(5));

        // Process (pop) 2 of them.
        stack.pop();
        stack.pop();

        //Print the remaining stack.
        System.out.println("The remaining stack.");
        stack.printStack();
    }
}

