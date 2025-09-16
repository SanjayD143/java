class HospitalRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();

        Hospital hospitals1 = new Hospital(150, "Dr. Vijay");
        Hospital hospitals2 = new Hospital(200, "Dr. Prakash");

        Hospital[] hospitals = {hospitals1, hospitals2};
        doctor.doctorDetails(hospitals);
    }
}