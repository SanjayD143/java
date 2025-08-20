class TicketBooking{
public static void main (String[]args){
int numberOfBookings =5000;
int numberOfLeftTickets =2500;
int numberOfTicketAvailable =2400;
int numberOfWebsites =7;
int ticketPrice =700;
int siteTypes =4;

System.out.println("number of ticket booking=" +ticketPrice);
int [] TicketDetails ={numberOfBookings,numberOfLeftTickets,numberOfTicketAvailable,numberOfWebsites,ticketPrice,siteTypes};

int number=100000;
TicketDetails[0]=number;



System.out.println("---------------------------------");
for(int value =0;value<TicketDetails.length;value++){
	
int num=	TicketDetails[value];
System.out.println("types of="+num);	
}
	

}
}