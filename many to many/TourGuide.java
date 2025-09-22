class TourGuide {
    public String guideName;
    public int experienceYears;
    public TravelAgency agency;

    public TourGuide(String guideName, int experienceYears, TravelAgency agency) {
        this.guideName = guideName;
        this.experienceYears = experienceYears;
        this.agency = agency;
    }

    public void displayDetails() {
        System.out.println("Tour Guide Name == " + guideName);
        System.out.println("Experience Years == " + experienceYears);
        System.out.println("Travel Agency Founder == " + agency.founder);
    }
}