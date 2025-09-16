class Doctor {
    public void doctorDetails(Hospital[] hospitals) {
        for (Hospital hospital : hospitals) {
            hospital.hospitalDetails();
        }
    }
}