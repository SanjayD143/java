class Book {
    public static long[] bookISBNNumbers() {
        long[] bookISBNNumbers = {9780134685991L, 9780596009205L, 9780132350884L, 9780321356680L};
        System.out.println("Book ISBN numbers");
        return bookISBNNumbers;
    }

    public static String[] bookAuthors() {
        String[] bookAuthors = {"James Gosling", "Robert Martin", "Joshua Bloch", "Martin Fowler"};
        return bookAuthors;
    }

    public static char[] bookGrades() {
        char[] bookGrades = {'A', 'B', 'C', 'D'};
        return bookGrades;
    }

    public static int[] bookPageCounts() {
        int[] bookPageCounts = {350, 500, 720, 1200};
        return bookPageCounts;
    }

    public static double[] bookPrices() {
        double[] bookPrices = {499.99, 799.50, 999.00, 1250.75};
        return bookPrices;
    }

    public static float[] bookEditions() {
        float[] bookEditions = {1.0f, 2.0f, 3.5f, 4.1f};
        return bookEditions;
    }

    public static boolean[] bookIsAvailable() {
        boolean[] bookIsAvailable = {true, false, true, true};
        return bookIsAvailable;
    }
}
