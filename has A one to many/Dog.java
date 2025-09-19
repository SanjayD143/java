class Dog {
    public String dogName;
    public int dogAge;
    public Storage storage;

    public Dog(String dogName, int dogAge, Storage storage) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Dog: " + dogName + " | Age: " + dogAge);
        System.out.println("Food Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}