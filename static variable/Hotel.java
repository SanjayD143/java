class Hotel {
    public int roomCount;
    public String hotelTitle;
    public long gstNumber;
    public float starRating;
    public double roomPrice;
    public char roomType;
    public boolean swimmingPool;

    public Hotel(int roomCount, String hotelTitle, long gstNumber, float starRating,
                 double roomPrice, char roomType, boolean swimmingPool) {

        System.out.println("first try=" + this.roomCount);
        System.out.println("first try=" + this.hotelTitle);
        System.out.println("first try=" + this.gstNumber);
        System.out.println("first try=" + this.starRating);
        System.out.println("first try=" + this.roomPrice);
        System.out.println("first try=" + this.roomType);
        System.out.println("first try=" + this.swimmingPool);

        this.roomCount = roomCount;
        this.hotelTitle = hotelTitle;
        this.gstNumber = gstNumber;
        this.starRating = starRating;
        this.roomPrice = roomPrice;
        this.roomType = roomType;
        this.swimmingPool = swimmingPool;

        System.out.println("second try=" + this.roomCount);
        System.out.println("second try=" + this.hotelTitle);
        System.out.println("second try=" + this.gstNumber);
        System.out.println("second try=" + this.starRating);
        System.out.println("second try=" + this.roomPrice);
        System.out.println("second try=" + this.roomType);
        System.out.println("second try=" + this.swimmingPool);
    }
}
