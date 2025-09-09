class Planetarium {
    public int seats;

    public void planetariumInfo() {
        int shows = 5;
        System.out.println("Shows: " + shows);

        long planetariumID = 112233L;
        System.out.println("Planetarium ID: " + planetariumID);

        char grade = 'B';
        System.out.println("Grade: " + grade);

        float domeHeight = 15.5f;
        System.out.println("Dome Height: " + domeHeight);

        boolean openForPublic = true;
        System.out.println("Open for Public: " + openForPublic);

        double ticketPrice = 150.5;
        System.out.println("Ticket Price: " + ticketPrice);

        String name = "Space Dome";
        System.out.println("Name: " + name);

        seats = 200;
        System.out.println("Seats: " + seats);
    }
}
class PlanetariumRunner {
    public static void main(String[] args) {
        Planetarium planetarium = new Planetarium();
        planetarium.planetariumInfo();
    }
}
