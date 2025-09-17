class Library {
    public String name;
    public Book book;

    public Library(Book book) {
        this.name = book.name;
        this.book = book;
    }

    public void displayLibrary() {
        book.displayBook();
    }
}
