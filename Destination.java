class Destination {

    public static byte numberOfStops() {
        byte stops = 5; 
        return stops;
    }

    public static short distanceInKm() {
        short distance = 250;
        return distance;
    }

    public static int ticketPrice() {
        int price = 1500;
        return price;
    }

    public static long populationOfCity() {
        long population = 9876543210L;
        return population;
    }

    public static float travelTimeHours() {
        float time = 5.5f; 
        return time;
    }

    public static double hotelCost() {
        double cost = 12345.67; 
        return cost;
    }

    public static char cityCode() {
        char code = 'B'; 
        return code;
    }

    public static boolean isTouristPlace() {
        boolean tourist = true;
        return tourist;
    }

    public static void main(String[] args) {
        System.out.println("Number of stops: " + numberOfStops());
        System.out.println("Distance (km): " + distanceInKm());
        System.out.println("Ticket price: ₹" + ticketPrice());
        System.out.println("Population of city: " + populationOfCity());
        System.out.println("Travel time (hours): " + travelTimeHours());
        System.out.println("Hotel cost: ₹" + hotelCost());
        System.out.println("City code: " + cityCode());
        System.out.println("Is tourist place? " + isTouristPlace());
    }
}




