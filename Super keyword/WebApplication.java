class WebApplication extends Software {
    public int webId;
    public String framework;
    public char level;
    public double loadTime;
    public long webKey;
    public float build;
    public boolean isWebApp;

    public WebApplication(int id, String name, char type, double size,
                          long licenseKey, float version, boolean isWebApp) {
        super.id = id;
        super.name = name;
        super.type = type;
        super.size = size;
        super.licenseKey = licenseKey;
        super.version = version;
        super.isSoftware = true;

        this.webId = id + 5;
        this.framework = "Spring Boot";
        this.level = type;
        this.loadTime = size / 2;
        this.webKey = licenseKey + 5555;
        this.build = version + 1.1f;
        this.isWebApp = isWebApp;
    }

    public void displayWebApp() {
        System.out.println("Software Name: " + super.name);
        System.out.println("Web Framework: " + framework);
        System.out.println("Software Version: " + super.version);
        System.out.println("Web Build: " + build);
        System.out.println("Software License: " + super.licenseKey);
        System.out.println("Web Key: " + webKey);
        System.out.println("Software Type: " + super.type);
        System.out.println("Web Level: " + level);
        System.out.println("Software Size: " + super.size);
        System.out.println("Web LoadTime: " + loadTime);
        System.out.println("Is Software: " + super.isSoftware);
        System.out.println("Is WebApp: " + isWebApp);
    }
}