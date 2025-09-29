class Novel extends Book {
    public Novel(String bookName, String author, double price) {
        super.bookName = bookName;
        super.author = author;
        super.price = price;
    }

    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
