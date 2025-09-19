class Table {
    public String tableName;
    public int tablePrice;
    public Storage storage;

    public Table(String tableName, int tablePrice, Storage storage) {
        this.tableName = tableName;
        this.tablePrice = tablePrice;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Table: " + tableName + " | Price: " + tablePrice);
        System.out.println("Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}