class Airline {
    public String airlineName;
    public int ticketPrice;
    public TravelAgency agency;

    public Airline(String airlineName, int ticketPrice, TravelAgency agency) {
        this.airlineName = airlineName;
        this.ticketPrice = ticketPrice;
        this.agency = agency;
    }

    public void displayDetails() {
        System.out.println("Airline Name == " + airlineName);
        System.out.println("Ticket Price == " + ticketPrice);
        System.out.println("Travel Agency Founder == " + agency.founder);
    }
}