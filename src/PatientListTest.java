public class PatientListTest {
    public static void main(String[] args) {
        PatientList patientList = new PatientList();

        // Add 5 patients to the list.
        patientList.addPatient(new Patient(1, "Alice", 3, 30));
        patientList.addPatient(new Patient(2, "Bob", 5, 45));
        patientList.addPatient(new Patient(3, "Charlie", 2, 25));
        patientList.addPatient(new Patient(4, "David", 4, 50));
        patientList.addPatient(new Patient(5, "Eve", 1, 35));
        // Printing the patient list
        System.out.println("Patient List:");
        patientList.printList();

        // Remove one by ID.
        patientList.removePatient(3);
        System.out.println();
        // Search for one by ID.
        Patient p = patientList.findPatient(2);
        if (p != null) {
            System.out.println("Patient - Id:" + p.id + " Name:" + p.name + " Severity:" + p.severity + " Age:" + p.age);
        }
        // Print the final list.
        System.out.println("Print the final list :");
        patientList.printList();
    }

}
