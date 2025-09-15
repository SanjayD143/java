class Appartment {
    public void appartmentDisplay(Floors[] floors) {
        for (int num = 0; num < floors.length; num++) {
            Floors floorDetails = floors[num];
            floorDetails.displayFloors();
            System.out.println("-----------------");
        }
    }
}