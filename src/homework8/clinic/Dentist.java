package homework8.clinic;

public class Dentist extends Doctor {

    @Override
    void heals(Patient patient) {
        System.out.println("Dentist treats " + patient.getName());
    }
}
