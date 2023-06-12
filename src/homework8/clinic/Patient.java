package homework8.clinic;

class Patient {
    private String name;
    private int age;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Doctor doctor(TreatmentPlan treatmentPlan) {
        int number = treatmentPlan.getNumber();
        return (number == 1) ? new Surgeon() : (number == 2) ? new Dentist() : new Therapist();
    }

    public String getName() {
        return name;
    }
}
