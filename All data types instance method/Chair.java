class Chair {
    public int chairId = 444;
    public String material = "Wood";
    public char quality = 'A';
    public boolean isRecliner = false;
    public float weight = 15.75f;
    public long warrantyYears = 5L;
    public double price = 3500.00;

    public int chairNumber() {
        System.out.println("Chair ID = " + chairId);
        return chairId;
    }

    public String materialType() {
        System.out.println("Chair Material = " + material);
        return material;
    }

    public char rating() {
        System.out.println("Chair Quality Grade = " + quality);
        return quality;
    }

    public boolean reclinerCheck() {
        System.out.println("Is Recliner = " + isRecliner);
        return isRecliner;
    }

    public float chairWeight() {
        System.out.println("Chair Weight = " + weight);
        return weight;
    }

    public long warranty() {
        System.out.println("Warranty (Years) = " + warrantyYears);
        return warrantyYears;
    }

    public double cost() {
        System.out.println("Chair Price = " + price);
        return price;
    }
}
