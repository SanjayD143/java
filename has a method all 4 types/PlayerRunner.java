class PlayerRunner {
    public static void main(String[] args) {
        Team team = new Team("Red Warriors");
        Player player = new Player("Rohit", 75, team);
        player.displayDetails();
    }
}