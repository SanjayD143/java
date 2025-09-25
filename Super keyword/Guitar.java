class Guitar extends Instrument {
    public int strings;
    public String brand;
    public char typeCode;
    public double length;
    public long dealerContact;
    public float soundLevel;
    public boolean isElectric;

    public Guitar(int year, String name, char grade, double price, long serialNumber,
                  float weight, boolean isAcoustic,
                  int strings, String brand, char typeCode,
                  double length, long dealerContact, float soundLevel, boolean isElectric) {

        super.year = year;
        super.name = name;
        super.grade = grade;
        super.price = price;
        super.serialNumber = serialNumber;
        super.weight = weight;
        super.isAcoustic = isAcoustic;

        this.strings = strings;
        this.brand = brand;
        this.typeCode = typeCode;
        this.length = length;
        this.dealerContact = dealerContact;
        this.soundLevel = soundLevel;
        this.isElectric = isElectric;
    }

    public void displayGuitar() {
        System.out.println("Instrument: " + super.name + " | Year: " + super.year);
        System.out.println("Price: " + super.price + " | Serial: " + super.serialNumber);
        System.out.println("Brand: " + brand + " | Strings: " + strings);
        System.out.println("Length: " + length + " | Sound Level: " + soundLevel);
        System.out.println("Acoustic: " + super.isAcoustic + " | Electric: " + isElectric);
    }
}
