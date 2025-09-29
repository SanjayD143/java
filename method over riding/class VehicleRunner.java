class VehicleRunner {
    public static void main(String[] args){
        ElectricVehicle ev = new ElectricVehicle();
        ev.displayVehicleName("Tesla Model S");
        ev.displayVehiclePrice(80000);
        ev.displayVehicleId(40404L);
        ev.displayVehicleMileage(396.5f);
        ev.displayVehicleEngine(0.0d);
        ev.displayVehicleGrade('A');
        ev.displayVehicleIsElectric(true);
    }
}
