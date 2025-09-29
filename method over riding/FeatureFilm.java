class FeatureFilm extends Movie {
    public void displayMovieName(String movieName) {
        System.out.println("Its a FeatureFilm (Derived class) method");
        System.out.println(movieName);
    }
    public void displayMoviePrice(int moviePrice) {
        System.out.println(moviePrice);
    }
    public void displayMovieId(long movieId) {
        System.out.println(movieId);
    }
    public void displayMovieRating(float movieRating) {
        System.out.println(movieRating);
    }
    public void displayMovieOnlinePrice(double movieOnlinePrice) {
        System.out.println(movieOnlinePrice);
    }
    public void displayMovieGrade(char movieGrade) {
        System.out.println(movieGrade);
    }
    public void displayMovieIsHit(boolean movieIsHit) {
        System.out.println(movieIsHit);
    }
}
