class HospitalRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Ramesh", "Cardiology");
        Hospital hospital = new Hospital("City Hospital", 150, doctor);
        hospital.displayHospital();
    }
}
