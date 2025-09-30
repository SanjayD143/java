class Microsoft {

    public static void main(String[] args) {

        String firstProduct = "Windows";
        String secondProduct = "Office";
        String thirdProduct = "Teams";
        String fourthProduct = "Azure";

        System.out.println("Microsoft Product List (Names)");
        System.out.println("---------------------------");

        String[] msProducts = { firstProduct, secondProduct, thirdProduct, fourthProduct };

        for (int i = 0; i < msProducts.length; i++) {
            System.out.println(msProducts[i]);
        }

        int windowsId = 201;
        int officeId = 202;
        int teamsId = 203;
        int azureId = 204;

        System.out.println("Microsoft Product List (IDs)");
        System.out.println("---------------------------");

        int[] msIds = { windowsId, officeId, teamsId, azureId };

        for (int i = 0; i < msIds.length; i++) {
            System.out.println(msIds[i]);
        }

        long windowsUsers = 1500000000L;
        long officeUsers = 1200000000L;
        long teamsUsers = 500000000L;
        long azureUsers = 800000000L;

        System.out.println("Microsoft Product List (Users in Count)");
        System.out.println("---------------------------");

        long[] msUsers = { windowsUsers, officeUsers, teamsUsers, azureUsers };

        for (int i = 0; i < msUsers.length; i++) {
            System.out.println(msUsers[i]);
        }

        float windowsVersion = 11.0f;
        float officeVersion = 365.5f;
        float teamsVersion = 4.7f;
        float azureVersion = 3.2f;

        System.out.println("Microsoft Product List (Versions)");
        System.out.println("---------------------------");

        float[] msVersions = { windowsVersion, officeVersion, teamsVersion, azureVersion };

        for (int i = 0; i < msVersions.length; i++) {
            System.out.println(msVersions[i]);
        }

        double windowsRevenue = 3000.55d;
        double officeRevenue = 2500.75d;
        double teamsRevenue = 1800.40d;
        double azureRevenue = 4000.90d;

        System.out.println("Microsoft Product List (Revenue in Million $)");
        System.out.println("---------------------------");

        double[] msRevenue = { windowsRevenue, officeRevenue, teamsRevenue, azureRevenue };

        for (int i = 0; i < msRevenue.length; i++) {
            System.out.println(msRevenue[i]);
        }

        char windowsRating = 'A';
        char officeRating = 'A';
        char teamsRating = 'B';
        char azureRating = 'A';

        System.out.println("Microsoft Product List (Ratings)");
        System.out.println("---------------------------");

        char[] msRatings = { windowsRating, officeRating, teamsRating, azureRating };

        for (int i = 0; i < msRatings.length; i++) {
            System.out.println(msRatings[i]);
        }

        boolean windowsActive = true;
        boolean officeActive = true;
        boolean teamsActive = true;
        boolean azureActive = true;

        System.out.println("Microsoft Product List (Active Status)");
        System.out.println("---------------------------");

        boolean[] msActive = { windowsActive, officeActive, teamsActive, azureActive };

        for (int i = 0; i < msActive.length; i++) {
            System.out.println(msActive[i]);
        }
    }
}
