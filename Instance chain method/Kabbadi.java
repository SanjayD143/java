class Kabbadi{
public int price;

public void amount(){

	this.playerName("manu");
	System.out.println("this is argument cons");
}
public void playerName(String name){
	
	this.playerID("maga",1245);
	System.out.println("this is double argument cons"+name);
}
public void playerID(String name,int playerID){
	this.debbutPlayers(5465,"bulls",'A');
		System.out.println("this is double argument cons  "+name+","+playerID);
}
public void debbutPlayers(int player,String name,char rate){
	this.highestPrice(54655,"bulls",'B',92225220l);
	System.out.println("this is multiple argument cons  "+player+","+name+","+rate);
	
}
public void highestPrice(int player,String name,char rate,long price){
	this.playerHeight(54655,"bulls",'B',92225220l,23.14f);
	System.out.println("this is multiple argument cons  "+player+","+name+","+rate+","+price);
	
}
public void playerHeight(int player,String name,char rate,long price,float height){
	this.avarage(54655,"bulls",'B',92225220l,23.14f,99.99);
	System.out.println("this is multiple argument cons  "+player+","+name+","+rate+","+price+","+height);
	
}	
public void avarage(int player,String name,char rate,long price,float height,double strikeRate){
	
	System.out.println("this is multiple argument cons  "+player+","+name+","+rate+","+price+","+height+","+strikeRate);
	
}	
}