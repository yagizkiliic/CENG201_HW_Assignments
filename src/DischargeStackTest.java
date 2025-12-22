public class DischargeStackTest {
    public static void main(String[] args) {

        DischargeStack stack = new DischargeStack();

        // Add 5 discharge records.
        stack.push(new DischargeRecord(189));
        stack.push(new DischargeRecord(298));
        stack.push(new DischargeRecord(865));
        stack.push(new DischargeRecord(432));
        stack.push(new DischargeRecord(515));

        // Process (pop) 2 of them.
        stack.pop();
        stack.pop();

        //Print the remaining stack.
        System.out.println("The remaining stack.");
        stack.printStack();
    }
}

