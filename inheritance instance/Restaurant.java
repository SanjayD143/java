class Restaurant extends Hotel {
    public static void setRoomRate() {
        roomRate = 4000;
        System.out.println("This is room rate: " + roomRate);
    }

    public void displayHotel() {
        hotelName = "Taj Hotel";
        System.out.println("This is hotel name: " + hotelName);
    }
}