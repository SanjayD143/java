class DoctorRunner {
    public static void main(String[] args) {
        Patient patient = new Patient("Rahul", 25);
        Doctor doctor = new Doctor("Dr. Shetty", "Cardiology", patient);
        doctor.displayDoctor();
    }
}
