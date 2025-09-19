class Laptop{
public String laptopName;
public int laptopPrice;
public Storage storage;

public Laptop(String laptopName,int laptopPrice,Storage storage){
this.laptopName=laptopName;
this.laptopPrice=laptopPrice;
this.storage=storage;


}
public void displayLaptop(){
	
System.out.println("this is laptop"+laptopName);	
	
System.out.println("this is laptop"+storage.systemName);	
	
	
}



}