public class HospitalSystemTest {
    public static void main(String[] args) {
        HospitalSystem hospitalSystem = new HospitalSystem();

        // add 10 patients
        hospitalSystem.addPatient(new Patient(1, "Ahmet", 7, 32));
        hospitalSystem.addPatient(new Patient(2, "Buse", 5, 29));
        hospitalSystem.addPatient(new Patient(3, "Cem", 9, 41));
        hospitalSystem.addPatient(new Patient(4, "Deniz", 4, 24));
        hospitalSystem.addPatient(new Patient(5, "Ece", 8, 35));
        hospitalSystem.addPatient(new Patient(6, "Fatih", 6, 51));
        hospitalSystem.addPatient(new Patient(7, "Gamze", 3, 19));
        hospitalSystem.addPatient(new Patient(8, "Hakan", 10, 63));
        hospitalSystem.addPatient(new Patient(9, "İpek", 2, 27));
        hospitalSystem.addPatient(new Patient(10, "Kerem", 1, 44));

        // Treatment requests: 5 normal, 3 priority
        hospitalSystem.addTreatmentRequest(1, false);
        hospitalSystem.addTreatmentRequest(3, true);
        hospitalSystem.addTreatmentRequest(5, false);
        hospitalSystem.addTreatmentRequest(8, true);
        hospitalSystem.addTreatmentRequest(2, false);
        hospitalSystem.addTreatmentRequest(4, false);
        hospitalSystem.addTreatmentRequest(6, true);
        hospitalSystem.addTreatmentRequest(7, false);

        // 2 discharge
        hospitalSystem.addDischargeRecord(10);
        hospitalSystem.addDischargeRecord(9);

        // Process 4 treatments
        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();
        hospitalSystem.processTreatment();

        //hospitalSystem.sortPatients();

        hospitalSystem.printSystemState();
    }
}

