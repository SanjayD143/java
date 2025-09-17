class CityRunner {
    public static void main(String[] args) {
        Building building = new Building("Skyscraper");
        City city = new City(building);
        city.displayCity();
    }
}
