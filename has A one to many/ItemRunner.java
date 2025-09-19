 class ItemRunner {
    public static void main(String[] args) {
        Storage storage1 = new Storage("RAM", 1520);
        Storage storage2 = new Storage("ROM", 4520);

        Book book = new Book("Java Programming", 500, storage1);
        Pen pen = new Pen("Parker", 150, storage1);
        Bag bag = new Bag("Wildcraft", 2000, storage2);
        Chair chair = new Chair("Wooden Chair", 3500, storage1);
        Table table = new Table("Study Table", 4500, storage2);

        book.displayDetails();
        pen.displayDetails();
        bag.displayDetails();
        chair.displayDetails();
        table.displayDetails();
    }
}