class TravelingRunner {
    public static void main(String[] args) {
        TravelAgency agency = new TravelAgency("Emily Johnson");

        Airline airline = new Airline("Air India", 5000, agency);
        Hotel hotel = new Hotel("Grand Palace", 3000, agency);
        TourGuide guide = new TourGuide("Rajesh Kumar", 10, agency);
        TravelPackage travelPackage = new TravelPackage("Europe Tour", 25000, agency);

        airline.displayDetails();
        hotel.displayDetails();
        guide.displayDetails();
        travelPackage.displayDetails();
    }
}