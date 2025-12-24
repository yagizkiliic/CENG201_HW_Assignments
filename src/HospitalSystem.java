import java.util.HashMap;

public class HospitalSystem {

    PatientList patientList;
    TreatmentQueue normalQueue;
    TreatmentQueue priorityQueue;
    DischargeStack dischargeStack;
    HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    public void addPatient(Patient patient) { //Add a new patient to the system.
        patientList.addPatient(patient);
        patientMap.put(patient.id,patient);
    }

    public void addTreatmentRequest(int patientId, boolean priority) {
        if (patientMap.get(patientId) == null) {  // check patient are in list
            System.out.println("Patient not found: " + patientId);
            return;
        }
        TreatmentRequest request = new TreatmentRequest(patientId);
        if (priority == true) {  // Check priority or normal
            priorityQueue.enQueue(request);
        }else {
            normalQueue.enQueue(request);
        }
    }

    public void addDischargeRecord(int patientId) {
        DischargeRecord dischargeRecord = new DischargeRecord(patientId); // Create record by ID
        dischargeStack.push(dischargeRecord); // Push the stack
    }

    public void processTreatment() {
        TreatmentRequest request;
        if (priorityQueue.size() > 0) { // Firstly, dequeue from priority
            request = priorityQueue.deQueue();
        } else if (normalQueue.size() > 0) { // then, dequeue from normal
            request = normalQueue.deQueue();
        } else {
            return;
        }

        addDischargeRecord(request.patientId); // add stack to discharge
    }

    public void sortPatients() { // sort with bubble sort
        Patient[] array = new Patient[patientList.size()];
        Node temp = patientList.head;
        int i=0;
        while (temp!=null) {
            array[i] = temp.data;
            i++;
            temp = temp.next;
        }
        for (int a=0; a<array.length-1; a++) {
            for (int b=0;b<array.length-a-1;b++) {
                if (array[b].severity < array[b+1].severity) {
                    Patient temp1 = array[b];
                    array[b] = array[b+1];
                    array[b+1] = temp1;
                }
            }
        }
        for (int k=0; k<array.length; k++) {
            Patient patient = array[k];
            System.out.println("ID:" + patient.id + " Sev:" + patient.severity + " Name:" + patient.name);
        }
    }

    public void printSystemState() {   // Printing current system state

        System.out.println("Patient List:");
        System.out.println("----------------");
        patientList.printList();
        System.out.println();

        System.out.println("Patient Normal Queue:");
        System.out.println("----------------");
        normalQueue.printQueue();
        System.out.println();
        System.out.println("Patient Priority Queue:");
        System.out.println("----------------");
        priorityQueue.printQueue();
        System.out.println();

        System.out.println("Discharge Stack:");
        System.out.println("----------------");
        dischargeStack.printStack();
    }


}












