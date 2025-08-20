class TrafficRunner{
public static void main(String[]args){
int numberOfTypes =Traffic.types(50);
System.out.println("Traffic types  " +numberOfTypes);




	char signalTypes=Traffic.signal();
	System.out.println("signal types "+ signalTypes);
	
	
	float runwayDistance =Traffic.distance();
	System.out.println(" signal Distance ="+runwayDistance);
	
	double numberOfVehicles =Traffic.distance();
	System.out.println("no of vehicles in this area"+numberOfVehicles);


boolean redLight =Traffic.redIsStop();
	System.out.println("red signal is stop =="+redLight);
	
	
	long phoneNumber = Traffic.officerContact();
        System.out.println("Traffic officer contact= " + phoneNumber);
}

}