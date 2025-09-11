class Refrigerator {
    public int fridgeId = 333;
    public String brand = "LG";
    public char energyRating = 'A';
    public boolean doubleDoor = true;
    public float capacity = 350.5f;
    public long warrantyYears = 10L;
    public double price = 32000.75;

    public int fridgeNumber() {
        System.out.println("Refrigerator ID = " + fridgeId);
        return fridgeId;
    }

    public String brandName() {
        System.out.println("Refrigerator Brand = " + brand);
        return brand;
    }

    public char rating() {
        System.out.println("Refrigerator Energy Rating = " + energyRating);
        return energyRating;
    }

    public boolean type() {
        System.out.println("Is Double Door = " + doubleDoor);
        return doubleDoor;
    }

    public float capacityLitres() {
        System.out.println("Refrigerator Capacity = " + capacity + " Litres");
        return capacity;
    }

    public long warranty() {
        System.out.println("Warranty (Years) = " + warrantyYears);
        return warrantyYears;
    }

    public double cost() {
        System.out.println("Refrigerator Price = " + price);
        return price;
    }
}