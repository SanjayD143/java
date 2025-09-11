class Bottle {
    public int bottleId = 555;
    public String brand = "Milton";
    public char grade = 'A';
    public boolean isSteel = true;
    public float capacity = 1.5f;
    public long warrantyYears = 1L;
    public double price = 750.25;

    public int bottleNumber() {
        System.out.println("Bottle ID = " + bottleId);
        return bottleId;
    }

    public String brandName() {
        System.out.println("Bottle Brand = " + brand);
        return brand;
    }

    public char rating() {
        System.out.println("Bottle Grade = " + grade);
        return grade;
    }

    public boolean type() {
        System.out.println("Is Steel Bottle = " + isSteel);
        return isSteel;
    }

    public float capacityLitres() {
        System.out.println("Bottle Capacity = " + capacity + " Litres");
        return capacity;
    }

    public long warranty() {
        System.out.println("Warranty (Years) = " + warrantyYears);
        return warrantyYears;
    }

    public double cost() {
        System.out.println("Bottle Price = " + price);
        return price;
    }
}
