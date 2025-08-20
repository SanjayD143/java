class Hospital {
    public static long[] hospitalContactNumbers() {
        long[] hospitalContactNumbers = {9988776655L, 8877665544L, 7766554433L, 6655443322L};
        System.out.println("Hospital contact numbers");
        return hospitalContactNumbers;
    }

    public static String[] hospitalNames() {
        String[] hospitalNames = {"Apollo Hospital", "Fortis Hospital", "Manipal Hospital", "Narayana Health"};
        return hospitalNames;
    }

    public static char[] hospitalGrades() {
        char[] hospitalGrades = {'A', 'B', 'C', 'A'};
        return hospitalGrades;
    }

    public static int[] hospitalCapacities() {
        int[] hospitalCapacities = {500, 750, 1000, 1200};
        return hospitalCapacities;
    }

    public static double[] hospitalBills() {
        double[] hospitalBills = {25000.50, 40000.75, 120000.00, 75000.25};
        return hospitalBills;
    }

    public static float[] hospitalRatings() {
        float[] hospitalRatings = {4.5f, 4.0f, 4.8f, 3.9f};
        return hospitalRatings;
    }

    public static boolean[] hospitalIsGovernment() {
        boolean[] hospitalIsGovernment = {false, false, true, true};
        return hospitalIsGovernment;
    }
}
