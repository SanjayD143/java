class Hospital {
    public String hospitalName;
    public int numberOfBeds;
    public Doctor doctor;

    public Hospital(String hospitalName, int numberOfBeds, Doctor doctor) {
        this.hospitalName = hospitalName;
        this.numberOfBeds = numberOfBeds;
        this.doctor = doctor;
    }

    public void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName + ", Number of Beds: " + numberOfBeds);
        System.out.println("Doctor Name: " + doctor.doctorName + ", Specialization: " + doctor.specialization);
    }
}
