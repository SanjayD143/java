class BookRunner {
    public static void main(String[] args) {
        
        long[] bookISBNNumbers = Book.bookISBNNumbers();
        for (int index = 0; index < bookISBNNumbers.length; index++) {
            System.out.println("Book ISBN number: " + bookISBNNumbers[index]);
        }

        String[] bookAuthors = Book.bookAuthors();
        for (int index = 0; index < bookAuthors.length; index++) {
            System.out.println("Book author: " + bookAuthors[index]);
        }

        char[] bookGrades = Book.bookGrades();
        for (int index = 0; index < bookGrades.length; index++) {
            System.out.println("Book grade: " + bookGrades[index]);
        }

        int[] bookPageCounts = Book.bookPageCounts();
        for (int index = 0; index < bookPageCounts.length; index++) {
            System.out.println("Book page count: " + bookPageCounts[index]);
        }

        double[] bookPrices = Book.bookPrices();
        for (int index = 0; index < bookPrices.length; index++) {
            System.out.println("Book price: ₹" + bookPrices[index]);
        }

        float[] bookEditions = Book.bookEditions();
        for (int index = 0; index < bookEditions.length; index++) {
            System.out.println("Book edition: " + bookEditions[index]);
        }

        boolean[] bookIsAvailable = Book.bookIsAvailable();
        for (int index = 0; index < bookIsAvailable.length; index++) {
            System.out.println("Book availability: " + bookIsAvailable[index]);
        }
    }
}
