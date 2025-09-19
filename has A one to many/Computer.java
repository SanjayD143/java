class Computer{
public String systemName;
public int systemPrice;
public Storage storage;

public Computer(String systemName,int systemPrice,Storage storage){
this.systemName=systemName;
this.systemPrice=systemPrice;
this.storage=storage;


}
public void displayComputer(){
System.out.println("this is computer"+systemPrice);	
	
	
	
}

}