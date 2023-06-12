package homework8.clinic;

public class Therapist extends Doctor {

    @Override
    void heals(Patient patient) {
        System.out.println("Therapist treats " + patient.getName());
    }
}
