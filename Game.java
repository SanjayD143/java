class Game {
    public static long[] gamePlayerIds() {
        long[] gamePlayerIds = {1001L, 1002L, 1003L, 1004L};
        System.out.println("Game player IDs list");
        return gamePlayerIds;
    }

    public static String[] gameNames() {
        String[] gameNames = {"Cricket", "Football", "Hockey", "Badminton"};
        return gameNames;
    }

    public static char[] gameLevels() {
        char[] gameLevels = {'A', 'B', 'C', 'D'};
        return gameLevels;
    }

    public static int[] gameScores() {
        int[] gameScores = {250, 120, 300, 450};
        return gameScores;
    }

    public static double[] gameDurationsInHours() {
        double[] gameDurationsInHours = {2.5, 1.75, 3.0, 4.25};
        return gameDurationsInHours;
    }

    public static float[] gameRatings() {
        float[] gameRatings = {4.5f, 3.8f, 4.9f, 4.2f};
        return gameRatings;
    }

    public static boolean[] gameIsOnline() {
        boolean[] gameIsOnline = {true, true, false, true};
        return gameIsOnline;
    }
}
