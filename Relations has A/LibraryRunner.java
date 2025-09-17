class LibraryRunner {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        Library library = new Library(book);
        library.displayLibrary();
    }
}
