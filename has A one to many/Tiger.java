class Tiger {
    public String tigerName;
    public int tigerAge;
    public Storage storage;

    public Tiger(String tigerName, int tigerAge, Storage storage) {
        this.tigerName = tigerName;
        this.tigerAge = tigerAge;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Tiger: " + tigerName + " | Age: " + tigerAge);
        System.out.println("Food Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}