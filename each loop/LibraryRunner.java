class LibraryRunner {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();

        Library librarian1 = new Library(10000, "Savitha");
        Library librarian2 = new Library(5000, "Ravi");

        Library[] libraries = {librarian1, librarian2};
        librarian.librarianDetails(libraries);
    }
}