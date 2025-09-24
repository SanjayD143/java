class Country extends City {
    public static void setPopulation() {
        population = 12000000;
        System.out.println("This is population: " + population);
    }

    public void displayCity() {
        cityName = "Bangalore";
        System.out.println("This is city name: " + cityName);
    }
}