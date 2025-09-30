class Google {
    public static void main(String[] args) {


        String chrome = "Chrome";
        String gmail = "Gmail";
        String maps = "Maps";
        String drive = "Drive";

        System.out.println("Google Products");
        System.out.println("---------------------------");
        String[] googleProducts = { chrome, gmail, maps, drive };
        for (int i = 0; i < googleProducts.length; i++) {
            System.out.println(googleProducts[i]);
        }

     
        int chromeId = 101;
        int gmailId = 102;
        int mapsId = 103;
        int driveId = 104;

        System.out.println("Google Product IDs");
        System.out.println("---------------------------");
        int[] googleIds = { chromeId, gmailId, mapsId, driveId };
        for (int i = 0; i < googleIds.length; i++) {
            System.out.println(googleIds[i]);
        }

    
        long chromeUsers = 2000000000L;
        long gmailUsers = 1800000000L;
        long mapsUsers = 1500000000L;
        long driveUsers = 1200000000L;

        System.out.println("Google Product Users");
        System.out.println("---------------------------");
        long[] googleUsers = { chromeUsers, gmailUsers, mapsUsers, driveUsers };
        for (int i = 0; i < googleUsers.length; i++) {
            System.out.println(googleUsers[i]);
        }

    
        float chromeVersion = 120.5f;
        float gmailVersion = 15.3f;
        float mapsVersion = 11.2f;
        float driveVersion = 90.7f;

        System.out.println("Google Product Versions");
        System.out.println("---------------------------");
        float[] googleVersions = { chromeVersion, gmailVersion, mapsVersion, driveVersion };
        for (int i = 0; i < googleVersions.length; i++) {
            System.out.println(googleVersions[i]);
        }

  
        double chromeRevenue = 2000.55d;
        double gmailRevenue = 1500.99d;
        double mapsRevenue = 1100.75d;
        double driveRevenue = 900.25d;

        System.out.println("Google Product Revenue (in M$)");
        System.out.println("---------------------------");
        double[] googleRevenue = { chromeRevenue, gmailRevenue, mapsRevenue, driveRevenue };
        for (int i = 0; i < googleRevenue.length; i++) {
            System.out.println(googleRevenue[i]);
        }


        char chromeRating = 'A';
        char gmailRating = 'A';
        char mapsRating = 'B';
        char driveRating = 'A';

        System.out.println("Google Product Ratings");
        System.out.println("---------------------------");
        char[] googleRatings = { chromeRating, gmailRating, mapsRating, driveRating };
        for (int i = 0; i < googleRatings.length; i++) {
            System.out.println(googleRatings[i]);
        }


        boolean chromeActive = true;
        boolean gmailActive = true;
        boolean mapsActive = true;
        boolean driveActive = true;

        System.out.println("Google Products Active?");
        System.out.println("---------------------------");
        boolean[] googleActive = { chromeActive, gmailActive, mapsActive, driveActive };
        for (int i = 0; i < googleActive.length; i++) {
            System.out.println(googleActive[i]);
        }
    }
}
