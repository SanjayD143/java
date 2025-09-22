class Tennis {
    public String playerName;
    public int matchesPlayed;
    public SportsClub club;

    public Tennis(String playerName, int matchesPlayed, SportsClub club) {
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
        this.club = club;
    }

    public void displayDetails() {
        System.out.println("Tennis Player == " + playerName);
        System.out.println("Matches Played == " + matchesPlayed);
        System.out.println("Club Founder == " + club.clubFounder);
    }
}