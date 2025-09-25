class House extends Building {
    public int rooms;
    public String owner;
    public char paintCode;
    public double cost;
    public long contactNo;
    public float rent;
    public boolean isForSale;

    public House(int floors, String address, char type, double area, long buildingId,
                 float height, boolean isCommercial,
                 int rooms, String owner, char paintCode, double cost,
                 long contactNo, float rent, boolean isForSale) {

        super.floors = floors;
        super.address = address;
        super.type = type;
        super.area = area;
        super.buildingId = buildingId;
        super.height = height;
        super.isCommercial = isCommercial;

        this.rooms = rooms;
        this.owner = owner;
        this.paintCode = paintCode;
        this.cost = cost;
        this.contactNo = contactNo;
        this.rent = rent;
        this.isForSale = isForSale;
    }

    public void displayHouse() {
        System.out.println("Building address: " + super.address + " | Floors: " + super.floors);
        System.out.println("Area: " + super.area + " | Height: " + super.height);
        System.out.println("Owner: " + owner + " | Rooms: " + rooms);
        System.out.println("Cost: " + cost + " | Rent: " + rent);
        System.out.println("For Sale: " + isForSale);
    }
}
