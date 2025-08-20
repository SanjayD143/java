class IndiaSquadRunner{
public static void main(String []args){
	String[] names ={"surya kumar","shubhman gill","abhishek sharma","bumrah"};
String[] players =IndiaSquad.team(names);
	for(int player=0;player<players.length;player++){
		
		System.out.println("squad announced  "+players[player]);

	}


}


}