class ElectricVehicle extends Vehicle {
    public void displayVehicleName(String vehicleName){
        System.out.println("Its an ElectricVehicle (Derived class) method");
        System.out.println(vehicleName);
    }
    public void displayVehiclePrice(int vehiclePrice){
        System.out.println(vehiclePrice);
    }
    public void displayVehicleId(long vehicleId){
        System.out.println(vehicleId);
    }
    public void displayVehicleMileage(float vehicleMileage){
        System.out.println(vehicleMileage);
    }
    public void displayVehicleEngine(double engineCapacity){
        System.out.println(engineCapacity);
    }
    public void displayVehicleGrade(char vehicleGrade){
        System.out.println(vehicleGrade);
    }
    public void displayVehicleIsElectric(boolean isElectric){
        System.out.println(isElectric);
    }
}