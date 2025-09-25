class GangaRiver extends River {
    public int tributaries;
    public String country;
    public char cleanlinessLevel;
    public double depth;           
    public long localAuthorityContact;
    public float biodiversityIndex;
    public boolean isProtected;

    public GangaRiver(int length, String name, char grade, double flowRate, long idNumber,
                      float temperature, boolean isPolluted,
                      int tributaries, String country, char cleanlinessLevel,
                      double depth, long localAuthorityContact, float biodiversityIndex,
                      boolean isProtected) {

        super.length = length;
        super.name = name;
        super.grade = grade;
        super.flowRate = flowRate;
        super.idNumber = idNumber;
        super.temperature = temperature;
        super.isPolluted = isPolluted;

        this.tributaries = tributaries;
        this.country = country;
        this.cleanlinessLevel = cleanlinessLevel;
        this.depth = depth;
        this.localAuthorityContact = localAuthorityContact;
        this.biodiversityIndex = biodiversityIndex;
        this.isProtected = isProtected;
    }

    public void displayGangaRiver() {
        System.out.println("River: " + super.name + " | Length: " + super.length + " km");
        System.out.println("Flow Rate: " + super.flowRate + " | Temp: " + super.temperature);
        System.out.println("Polluted: " + super.isPolluted + " | Grade: " + super.grade);
        System.out.println("Tributaries: " + tributaries + " | Country: " + country);
        System.out.println("Depth: " + depth + " | Biodiversity Index: " + biodiversityIndex);
        System.out.println("Cleanliness Level: " + cleanlinessLevel + " | Protected: " + isProtected);
    }
}
