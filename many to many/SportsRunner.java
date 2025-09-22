class SportsRunner {
    public static void main(String[] args) {
        SportsClub club = new SportsClub("John Smith");

        Football football = new Football("Red Warriors", 11, club);
        Basketball basketball = new Basketball("Blue Tigers", 5, club);
        Tennis tennis = new Tennis("Roger Federer", 1200, club);
        Cricket cricket = new Cricket("Golden Eagles", 11, club);
        Swimming swimming = new Swimming("Michael Phelps", 28, club);

        football.displayDetails();
        basketball.displayDetails();
        tennis.displayDetails();
        cricket.displayDetails();
        swimming.displayDetails();
    }
}