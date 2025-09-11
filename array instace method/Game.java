class Game {
    public String[] games = {"Cricket", "Football", "Hockey", "Tennis"};

    public void gameName() {
        System.out.println("Total Games = " + games.length);
        for (int i = 0; i < games.length; i++) {
            System.out.println("Game = " + games[i]);
        }
    }
}