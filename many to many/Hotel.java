class Hotel {
    public String hotelName;
    public int roomPrice;
    public TravelAgency agency;

    public Hotel(String hotelName, int roomPrice, TravelAgency agency) {
        this.hotelName = hotelName;
        this.roomPrice = roomPrice;
        this.agency = agency;
    }

    public void displayDetails() {
        System.out.println("Hotel Name == " + hotelName);
        System.out.println("Room Price == " + roomPrice);
        System.out.println("Travel Agency Founder == " + agency.founder);
    }
}