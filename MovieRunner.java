class MovieRunner {
    public static void main(String[] args) {

        long[] movieBudgets = Movie.movieBudgets();
        for (int index = 0; index < movieBudgets.length; index++) {
            System.out.println("Movie budget: " + movieBudgets[index]);
        }

        String[] movieNames = Movie.movieNames();
        for (int index = 0; index < movieNames.length; index++) {
            System.out.println("Movie name: " + movieNames[index]);
        }

        char[] movieRatingsByStars = Movie.movieRatingsByStars();
        for (int index = 0; index < movieRatingsByStars.length; index++) {
            System.out.println("Movie rating by star: " + movieRatingsByStars[index]);
        }

        int[] movieDurations = Movie.movieDurations();
        for (int index = 0; index < movieDurations.length; index++) {
            System.out.println("Movie duration in minutes: " + movieDurations[index]);
        }

        double[] movieCollections = Movie.movieCollections();
        for (int index = 0; index < movieCollections.length; index++) {
            System.out.println("Movie collection in crores: " + movieCollections[index]);
        }

        float[] movieImdbRatings = Movie.movieImdbRatings();
        for (int index = 0; index < movieImdbRatings.length; index++) {
            System.out.println("Movie IMDb rating: " + movieImdbRatings[index]);
        }

        boolean[] movieIsHit = Movie.movieIsHit();
        for (int index = 0; index < movieIsHit.length; index++) {
            System.out.println("Movie is hit: " + movieIsHit[index]);
        }
    }
}
