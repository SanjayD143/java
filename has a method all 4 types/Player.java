class Player {
    public String playerName;
    public int playerScore;
    public Team team;

    public Player(String playerName, int playerScore, Team team) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.team = team;
    }

    public void displayDetails() {
        System.out.println("Player name==" + playerName);
        System.out.println("Player score==" + playerScore);
        System.out.println("Team name==" + team.teamName);
    }
}
