class Swimming {
    public String swimmerName;
    public int medals;
    public SportsClub club;

    public Swimming(String swimmerName, int medals, SportsClub club) {
        this.swimmerName = swimmerName;
        this.medals = medals;
        this.club = club;
    }

    public void displayDetails() {
        System.out.println("Swimmer Name == " + swimmerName);
        System.out.println("Medals Won == " + medals);
        System.out.println("Club Founder == " + club.clubFounder);
    }
}