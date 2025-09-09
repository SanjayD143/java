class Country {
    public void countryName(String name) {
        this.countryID("India", 401);
        System.out.println("this is argument cons " + name);
    }
    public void countryID(String name, int id) {
        this.countryCode("Japan", 501, 'J');
        System.out.println("this is double argument cons " + name + "," + id);
    }
    public void countryCode(String name, int id, char code) {
        this.countryPopulation("USA", 601, 'U', 331000000L);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + code);
    }
    public void countryPopulation(String name, int id, char code, long population) {
        this.countryArea("Russia", 701, 'R', 144000000L, 17100.5f);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + code + "," + population);
    }
    public void countryArea(String name, int id, char code, long population, float area) {
        this.countryGDP("China", 801, 'C', 1400000000L, 9600.3f, 15.8);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + code + "," + population + "," + area);
    }
    public void countryGDP(String name, int id, char code, long population, float area, double gdp) {
        System.out.println("this is multiple argument cons " + name + "," + id + "," + code + "," + population + "," + area + "," + gdp);
    }
}

