class Football {
    public String teamName;
    public int players;
    public SportsClub club;

    public Football(String teamName, int players, SportsClub club) {
        this.teamName = teamName;
        this.players = players;
        this.club = club;
    }

    public void displayDetails() {
        System.out.println("Football Team == " + teamName);
        System.out.println("Number of Players == " + players);
        System.out.println("Club Founder == " + club.clubFounder);
    }
}