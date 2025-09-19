class Book {
    public String bookName;
    public int bookPrice;
    public Storage storage;

    public Book(String bookName, int bookPrice, Storage storage) {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Book: " + bookName + " | Price: " + bookPrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}