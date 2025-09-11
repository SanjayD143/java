class Fan {
    public int fanId = 222;
    public String brand = "Crompton";
    public char efficiency = 'B';
    public boolean isCeilingFan = true;
    public float bladeSize = 48.0f;
    public long warrantyYears = 2L;
    public double price = 2500.50;

    public int fanNumber() {
        System.out.println("Fan ID = " + fanId);
        return fanId;
    }

    public String brandName() {
        System.out.println("Fan Brand = " + brand);
        return brand;
    }

    public char rating() {
        System.out.println("Fan Efficiency = " + efficiency);
        return efficiency;
    }

    public boolean type() {
        System.out.println("Is Ceiling Fan = " + isCeilingFan);
        return isCeilingFan;
    }

    public float size() {
        System.out.println("Fan Blade Size = " + bladeSize);
        return bladeSize;
    }

    public long warranty() {
        System.out.println("Warranty (Years) = " + warrantyYears);
        return warrantyYears;
    }

    public double cost() {
        System.out.println("Fan Price = " + price);
        return price;
    }
}





