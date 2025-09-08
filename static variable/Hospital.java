class Hospital {
    public int bedCount;
    public String hospitalName;
    public long hospitalId;
    public float consultationFee;
    public double treatmentCost;
    public char wardType;
    public boolean emergencyAvailable;

    public Hospital(int bedCount, String hospitalName, long hospitalId, float consultationFee,
                    double treatmentCost, char wardType, boolean emergencyAvailable) {

        System.out.println("first try=" + this.bedCount);
        System.out.println("first try=" + this.hospitalName);
        System.out.println("first try=" + this.hospitalId);
        System.out.println("first try=" + this.consultationFee);
        System.out.println("first try=" + this.treatmentCost);
        System.out.println("first try=" + this.wardType);
        System.out.println("first try=" + this.emergencyAvailable);

        this.bedCount = bedCount;
        this.hospitalName = hospitalName;
        this.hospitalId = hospitalId;
        this.consultationFee = consultationFee;
        this.treatmentCost = treatmentCost;
        this.wardType = wardType;
        this.emergencyAvailable = emergencyAvailable;

        System.out.println("second try=" + this.bedCount);
        System.out.println("second try=" + this.hospitalName);
        System.out.println("second try=" + this.hospitalId);
        System.out.println("second try=" + this.consultationFee);
        System.out.println("second try=" + this.treatmentCost);
        System.out.println("second try=" + this.wardType);
        System.out.println("second try=" + this.emergencyAvailable);
    }
}
