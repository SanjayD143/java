class AppRunner {
    public static void main(String[] args){
        MobileApp ma = new MobileApp();
        ma.displayAppName("WhatsApp");
        ma.displayAppPrice(0);
        ma.displayAppId(30303L);
        ma.displayAppRating(9.8f);
        ma.displayAppOnlineVersion(2.21);
        ma.displayAppGrade('A');
        ma.displayAppIsFree(true);
    }
}