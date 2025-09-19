class Elephant {
    public String elephantName;
    public int elephantAge;
    public Storage storage;

    public Elephant(String elephantName, int elephantAge, Storage storage) {
        this.elephantName = elephantName;
        this.elephantAge = elephantAge;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Elephant: " + elephantName + " | Age: " + elephantAge);
        System.out.println("Food Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}