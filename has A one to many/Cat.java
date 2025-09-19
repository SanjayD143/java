class Cat {
    public String catName;
    public int catAge;
    public Storage storage;

    public Cat(String catName, int catAge, Storage storage) {
        this.catName = catName;
        this.catAge = catAge;
        this.storage = storage;
    }

    public void displayDetails() {
        System.out.println("Cat: " + catName + " | Age: " + catAge);
        System.out.println("Food Storage -> " + storage.systemName + " " + storage.systemPrice);
    }
}