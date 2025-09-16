class Library {
    public int books;
    public String librarianName;

    public Library(int books, String librarianName) {
        this.books = books;
        this.librarianName = librarianName;
    }

    public void libraryDetails() {
        System.out.println("Library has " + books + " books, Librarian: " + librarianName);
    }
}




