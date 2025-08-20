class GameRunner {
    public static void main(String[] args) {

        long[] gamePlayerIds = Game.gamePlayerIds();
        for (int index = 0; index < gamePlayerIds.length; index++) {
            System.out.println("Game player ID: " + gamePlayerIds[index]);
        }

        String[] gameNames = Game.gameNames();
        for (int index = 0; index < gameNames.length; index++) {
            System.out.println("Game name: " + gameNames[index]);
        }

        char[] gameLevels = Game.gameLevels();
        for (int index = 0; index < gameLevels.length; index++) {
            System.out.println("Game level: " + gameLevels[index]);
        }

        int[] gameScores = Game.gameScores();
        for (int index = 0; index < gameScores.length; index++) {
            System.out.println("Game score: " + gameScores[index]);
        }

        double[] gameDurationsInHours = Game.gameDurationsInHours();
        for (int index = 0; index < gameDurationsInHours.length; index++) {
            System.out.println("Game duration in hours: " + gameDurationsInHours[index]);
        }

        float[] gameRatings = Game.gameRatings();
        for (int index = 0; index < gameRatings.length; index++) {
            System.out.println("Game rating: " + gameRatings[index]);
        }

        boolean[] gameIsOnline = Game.gameIsOnline();
        for (int index = 0; index < gameIsOnline.length; index++) {
            System.out.println("Game online status: " + gameIsOnline[index]);
        }
    }
}
