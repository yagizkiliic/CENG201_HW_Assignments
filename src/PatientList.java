public class PatientList {
   Node head;
   Node tail;

    public PatientList() {
        this.head = null;
        this.tail = null;
    }

    public void addPatient(Patient patient){  //Add a new patient to the list.
        Node newNode = new Node(patient);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
           tail.next = newNode;
           tail = newNode;
        }
    }

    public void removePatient(int id){  //Remove a patient by their ID.
        if (head == null) {
            System.out.println("Patient list is empty");
        } else if (head.data.id == id ) {
            head = head.next;
            if(head == null){
                tail = null;
            }
        }else {
            Node temp = head;
            while (temp.next != null && temp.next.data.id != id){
                temp = temp.next;
            }
            if (temp.next != null){
                if(temp.next == tail){
                    tail = temp;
                }
                temp.next = temp.next.next;
            }
        }
    }

    public Patient findPatient(int id){ //Search for a patient by ID and return the object.
        Node temp = head;
        while (temp != null){
            if (temp.data.id == id){
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }


    public void printList() { //Print all patients currently in the list.
        Node temp = head;
        while (temp != null) {
            System.out.println("Id:"+ temp.data.id+" Name:"+temp.data.name+" Severity:"+ temp.data.severity+" Age:"+temp.data.age + " -> ");
            temp = temp.next;
        }
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


}



