class LocationRunner {
    public static void main(String[] args) {
        Country.setPopulation();
        Country c = new Country();
        c.displayCity();
    }
}