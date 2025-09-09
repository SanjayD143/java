class Website {
    public void websiteName(String name) {
        this.websiteID("Google", 301);
        System.out.println("this is argument cons " + name);
    }
    public void websiteID(String name, int id) {
        this.websiteType("YouTube", 401, 'A');
        System.out.println("this is double argument cons " + name + "," + id);
    }
    public void websiteType(String name, int id, char category) {
        this.websiteTraffic("Amazon", 501, 'B', 10000000L);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category);
    }
    public void websiteTraffic(String name, int id, char category, long users) {
        this.websiteRank("Facebook", 601, 'C', 20000000L, 9.9f);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + users);
    }
    public void websiteRank(String name, int id, char category, long users, float growth) {
        this.websiteRating("Twitter", 701, 'D', 30000000L, 7.8f, 4.5);
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + users + "," + growth);
    }
    public void websiteRating(String name, int id, char category, long users, float growth, double rating) {
        System.out.println("this is multiple argument cons " + name + "," + id + "," + category + "," + users + "," + growth + "," + rating);
    }
}

