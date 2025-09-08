class Satellite {
    public int satellitePosition;
    public String satelliteName;
    public long satelliteId;
    public float orbitHeight;
    public double weight;
    public char satelliteCode;
    public boolean active;

    public Satellite(int satellitePosition, String satelliteName, long satelliteId, float orbitHeight,
                     double weight, char satelliteCode, boolean active) {

        System.out.println("first try=" + this.satellitePosition);
        System.out.println("first try=" + this.satelliteName);
        System.out.println("first try=" + this.satelliteId);
        System.out.println("first try=" + this.orbitHeight);
        System.out.println("first try=" + this.weight);
        System.out.println("first try=" + this.satelliteCode);
        System.out.println("first try=" + this.active);

        this.satellitePosition = satellitePosition;
        this.satelliteName = satelliteName;
        this.satelliteId = satelliteId;
        this.orbitHeight = orbitHeight;
        this.weight = weight;
        this.satelliteCode = satelliteCode;
        this.active = active;

        System.out.println("second try=" + this.satellitePosition);
        System.out.println("second try=" + this.satelliteName);
        System.out.println("second try=" + this.satelliteId);
        System.out.println("second try=" + this.orbitHeight);
        System.out.println("second try=" + this.weight);
        System.out.println("second try=" + this.satelliteCode);
        System.out.println("second try=" + this.active);
    }
}
