class Table {
    public int tableId = 777;
    public String material = "Teak Wood";
    public char grade = 'B';
    public boolean isFoldable = false;
    public float height = 3.5f;
    public long warrantyYears = 3L;
    public double price = 8500.75;

    public int tableNumber() {
        System.out.println("Table ID = " + tableId);
        return tableId;
    }

    public String materialType() {
        System.out.println("Table Material = " + material);
        return material;
    }

    public char rating() {
        System.out.println("Table Grade = " + grade);
        return grade;
    }

    public boolean foldableCheck() {
        System.out.println("Is Foldable = " + isFoldable);
        return isFoldable;
    }

    public float tableHeight() {
        System.out.println("Table Height = " + height + " ft");
        return height;
    }

    public long warranty() {
        System.out.println("Warranty (Years) = " + warrantyYears);
        return warrantyYears;
    }

    public double cost() {
        System.out.println("Table Price = " + price);
        return price;
    }
}


