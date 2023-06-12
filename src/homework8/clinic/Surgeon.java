package homework8.clinic;

class Surgeon extends Doctor {

    @Override
    void heals(Patient patient) {
        System.out.println("Surgeon treats " + patient.getName());
    }
}
