class Ship {
    public int crewSize;
    public String shipTitle;
    public long registrationNo;
    public float cruiseSpeed;
    public double bookingCost;
    public char deckCategory;
    public boolean luxury;

    public Ship(int crewSize, String shipTitle, long registrationNo, float cruiseSpeed,
                double bookingCost, char deckCategory, boolean luxury) {

        System.out.println("first try=" + this.crewSize);
        System.out.println("first try=" + this.shipTitle);
        System.out.println("first try=" + this.registrationNo);
        System.out.println("first try=" + this.cruiseSpeed);
        System.out.println("first try=" + this.bookingCost);
        System.out.println("first try=" + this.deckCategory);
        System.out.println("first try=" + this.luxury);

        this.crewSize = crewSize;
        this.shipTitle = shipTitle;
        this.registrationNo = registrationNo;
        this.cruiseSpeed = cruiseSpeed;
        this.bookingCost = bookingCost;
        this.deckCategory = deckCategory;
        this.luxury = luxury;

        System.out.println("second try=" + this.crewSize);
        System.out.println("second try=" + this.shipTitle);
        System.out.println("second try=" + this.registrationNo);
        System.out.println("second try=" + this.cruiseSpeed);
        System.out.println("second try=" + this.bookingCost);
        System.out.println("second try=" + this.deckCategory);
        System.out.println("second try=" + this.luxury);
    }
}
