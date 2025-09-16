class Hospital {
    public int patients;
    public String doctorName;

    public Hospital(int patients, String doctorName) {
        this.patients = patients;
        this.doctorName = doctorName;
    }

    public void hospitalDetails() {
        System.out.println("Hospital has " + patients + " patients, Doctor: " + doctorName);
    }
}




