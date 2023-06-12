package homework8.clinic;

class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Lena", 30);
        patient1.doctor(new TreatmentPlan(3)).heals(patient1);
    }
}
