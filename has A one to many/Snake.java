class Snake {
    public String snakeName;
    public int snakeAge;
    public Storage storage;

    public Snake(String snakeName, int snakeAge, Storage storage) {
        this.snakeName = snakeName;
        this.snakeAge = snakeAge;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Snake: " + snakeName + " | Age: " + snakeAge);
        System.out.println("Food Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}