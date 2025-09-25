class SoftwareRunner {
    public static void main(String[] args) {
        WebApplication app = new WebApplication(1, "MyApp", 'W', 250.5, 1234567890L, 1.0f, true);
        app.displayWebApp();
    }
}
