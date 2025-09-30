class Zoho {

    public static void main(String[] args) {

        String firstProduct = "Zoho CRM";
        String secondProduct = "Zoho Books";
        String thirdProduct = "Zoho Mail";
        String fourthProduct = "Zoho Creator";

        System.out.println("Zoho Product List (Names)");
        System.out.println("---------------------------");

        String[] zohoProducts = { firstProduct, secondProduct, thirdProduct, fourthProduct };

        for (int i = 0; i < zohoProducts.length; i++) {
            System.out.println(zohoProducts[i]);
        }

        int crmId = 301;
        int booksId = 302;
        int mailId = 303;
        int creatorId = 304;

        System.out.println("Zoho Product List (IDs)");
        System.out.println("---------------------------");

        int[] zohoIds = { crmId, booksId, mailId, creatorId };

        for (int i = 0; i < zohoIds.length; i++) {
            System.out.println(zohoIds[i]);
        }

        long crmUsers = 500000000L;
        long booksUsers = 200000000L;
        long mailUsers = 300000000L;
        long creatorUsers = 100000000L;

        System.out.println("Zoho Product List (Users in Count)");
        System.out.println("---------------------------");

        long[] zohoUsers = { crmUsers, booksUsers, mailUsers, creatorUsers };

        for (int i = 0; i < zohoUsers.length; i++) {
            System.out.println(zohoUsers[i]);
        }

        float crmVersion = 10.5f;
        float booksVersion = 8.3f;
        float mailVersion = 6.2f;
        float creatorVersion = 12.7f;

        System.out.println("Zoho Product List (Versions)");
        System.out.println("---------------------------");

        float[] zohoVersions = { crmVersion, booksVersion, mailVersion, creatorVersion };

        for (int i = 0; i < zohoVersions.length; i++) {
            System.out.println(zohoVersions[i]);
        }

        double crmRevenue = 500.50d;
        double booksRevenue = 200.30d;
        double mailRevenue = 300.20d;
        double creatorRevenue = 150.15d;

        System.out.println("Zoho Product List (Revenue in Million $)");
        System.out.println("---------------------------");

        double[] zohoRevenue = { crmRevenue, booksRevenue, mailRevenue, creatorRevenue };

        for (int i = 0; i < zohoRevenue.length; i++) {
            System.out.println(zohoRevenue[i]);
        }

        char crmRating = 'A';
        char booksRating = 'B';
        char mailRating = 'A';
        char creatorRating = 'B';

        System.out.println("Zoho Product List (Ratings)");
        System.out.println("---------------------------");

        char[] zohoRatings = { crmRating, booksRating, mailRating, creatorRating };

        for (int i = 0; i < zohoRatings.length; i++) {
            System.out.println(zohoRatings[i]);
        }

        boolean crmActive = true;
        boolean booksActive = true;
        boolean mailActive = true;
        boolean creatorActive = true;

        System.out.println("Zoho Product List (Active Status)");
        System.out.println("---------------------------");

        boolean[] zohoActive = { crmActive, booksActive, mailActive, creatorActive };

        for (int i = 0; i < zohoActive.length; i++) {
            System.out.println(zohoActive[i]);
        }
    }
}
