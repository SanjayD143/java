class Star {
    public int starPosition;
    public String starName;
    public long starId;
    public float temperature;
    public double luminosity;
    public char starCode;
    public boolean visibleFromEarth;

    public Star(int starPosition, String starName, long starId, float temperature,
                double luminosity, char starCode, boolean visibleFromEarth) {

        System.out.println("first try=" + this.starPosition);
        System.out.println("first try=" + this.starName);
        System.out.println("first try=" + this.starId);
        System.out.println("first try=" + this.temperature);
        System.out.println("first try=" + this.luminosity);
        System.out.println("first try=" + this.starCode);
        System.out.println("first try=" + this.visibleFromEarth);

        this.starPosition = starPosition;
        this.starName = starName;
        this.starId = starId;
        this.temperature = temperature;
        this.luminosity = luminosity;
        this.starCode = starCode;
        this.visibleFromEarth = visibleFromEarth;

        System.out.println("second try=" + this.starPosition);
        System.out.println("second try=" + this.starName);
        System.out.println("second try=" + this.starId);
        System.out.println("second try=" + this.temperature);
        System.out.println("second try=" + this.luminosity);
        System.out.println("second try=" + this.starCode);
        System.out.println("second try=" + this.visibleFromEarth);
    }
}
