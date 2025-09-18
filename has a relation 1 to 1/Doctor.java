class Doctor {
    public String doctorName;
    public String specialization;
    public Patient patient;

    public Doctor(String doctorName, String specialization, Patient patient) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patient = patient;
    }

    public void displayDoctor() {
        System.out.println("Doctor: " + doctorName +", Specialization: " + specialization +", Patient: " + patient.patientName +", Age: " + patient.age);
    }
}
