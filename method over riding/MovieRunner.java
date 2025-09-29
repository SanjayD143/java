class MovieRunner {
    public static void main(String[] args) {
        FeatureFilm ff = new FeatureFilm();
        ff.displayMovieName("Inception");
        ff.displayMoviePrice(500);
        ff.displayMovieId(987654321L);
        ff.displayMovieRating(9.1f);
        ff.displayMovieOnlinePrice(550.50d);
        ff.displayMovieGrade('A');
        ff.displayMovieIsHit(true);
    }
}
