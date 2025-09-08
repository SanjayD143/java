class Galaxy {
    public int galaxyPosition;
    public String galaxyName;
    public long galaxyId;
    public float distanceFromEarth;
    public double mass;
    public char galaxyCode;
    public boolean spiral;

    public Galaxy(int galaxyPosition, String galaxyName, long galaxyId, float distanceFromEarth,
                  double mass, char galaxyCode, boolean spiral) {

        System.out.println("first try=" + this.galaxyPosition);
        System.out.println("first try=" + this.galaxyName);
        System.out.println("first try=" + this.galaxyId);
        System.out.println("first try=" + this.distanceFromEarth);
        System.out.println("first try=" + this.mass);
        System.out.println("first try=" + this.galaxyCode);
        System.out.println("first try=" + this.spiral);

        this.galaxyPosition = galaxyPosition;
        this.galaxyName = galaxyName;
        this.galaxyId = galaxyId;
        this.distanceFromEarth = distanceFromEarth;
        this.mass = mass;
        this.galaxyCode = galaxyCode;
        this.spiral = spiral;

        System.out.println("second try=" + this.galaxyPosition);
        System.out.println("second try=" + this.galaxyName);
        System.out.println("second try=" + this.galaxyId);
        System.out.println("second try=" + this.distanceFromEarth);
        System.out.println("second try=" + this.mass);
        System.out.println("second try=" + this.galaxyCode);
        System.out.println("second try=" + this.spiral);
    }
}
