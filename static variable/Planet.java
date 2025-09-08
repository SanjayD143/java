class Planet {
    public int planetPosition;
    public String planetName;
    public long series;
    public float gravity;
    public double diameter;
    public char planetCode;
    public boolean supportLife;

    public Planet(int planetPosition, String planetName, long series, float gravity,
                  double diameter, char planetCode, boolean supportLife) {

        System.out.println("first try=" + this.planetPosition);
        System.out.println("first try=" + this.planetName);
        System.out.println("first try=" + this.series);
        System.out.println("first try=" + this.gravity);
        System.out.println("first try=" + this.diameter);
        System.out.println("first try=" + this.planetCode);
        System.out.println("first try=" + this.supportLife);

        this.planetPosition = planetPosition;
        this.planetName = planetName;
        this.series = series;
        this.gravity = gravity;
        this.diameter = diameter;
        this.planetCode = planetCode;
        this.supportLife = supportLife;

        System.out.println("second try=" + this.planetPosition);
        System.out.println("second try=" + this.planetName);
        System.out.println("second try=" + this.series);
        System.out.println("second try=" + this.gravity);
        System.out.println("second try=" + this.diameter);
        System.out.println("second try=" + this.planetCode);
        System.out.println("second try=" + this.supportLife);
    }
}
