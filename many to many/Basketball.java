class Basketball {
    public String teamName;
    public int players;
    public SportsClub club;

    public Basketball(String teamName, int players, SportsClub club) {
        this.teamName = teamName;
        this.players = players;
        this.club = club;
    }

    public void displayDetails() {
        System.out.println("Basketball Team == " + teamName);
        System.out.println("Number of Players == " + players);
        System.out.println("Club Founder == " + club.clubFounder);
    }
}