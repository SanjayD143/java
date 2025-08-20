class Movie {
    public static long[] movieBudgets() {
        long[] movieBudgets = {100000000L, 250000000L, 500000000L, 750000000L};
        System.out.println("Movie budgets in rupees");
        return movieBudgets;
    }

    public static String[] movieNames() {
        String[] movieNames = {"KGF", "RRR", "Pushpa", "Jawan"};
        return movieNames;
    }

    public static char[] movieRatingsByStars() {
        char[] movieRatingsByStars = {'A', 'B', 'A', 'U'};
        return movieRatingsByStars;
    }

    public static int[] movieDurations() {
        int[] movieDurations = {155, 180, 165, 210};
        return movieDurations;
    }

    public static double[] movieCollections() {
        double[] movieCollections = {350.75, 500.50, 600.90, 1000.25};
        return movieCollections;
    }

    public static float[] movieImdbRatings() {
        float[] movieImdbRatings = {8.5f, 9.0f, 8.1f, 7.8f};
        return movieImdbRatings;
    }

    public static boolean[] movieIsHit() {
        boolean[] movieIsHit = {true, true, true, false};
        return movieIsHit;
    }
}
