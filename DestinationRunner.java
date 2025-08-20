class DestinationRunner {
    public static void main(String[] args) {

        byte stops = Destination.numberOfStops();
        System.out.println("Number of stops: " + stops);

        short distance = Destination.distanceInKm();
        System.out.println("Distance in km: " + distance);

        int price = Destination.ticketPrice();
        System.out.println("Ticket price: ₹" + price);

        long population = Destination.populationOfCity();
        System.out.println("Population of city: " + population);

        float time = Destination.travelTimeHours();
        System.out.println("Travel time in hours: " + time);

        double cost = Destination.hotelCost();
        System.out.println("Hotel cost: ₹" + cost);

        char code = Destination.cityCode();
        System.out.println("City code: " + code);

        boolean tourist = Destination.isTouristPlace();
        System.out.println("Is tourist place? " + tourist);
    }
}
