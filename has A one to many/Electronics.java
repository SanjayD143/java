class Electronics{
public String names;
public int price;
public Storage storage;

public Electronics(String names,int price,Storage storage){
this.names=names;
this.price=price;
this.storage=storage;

}
public void displayElectronics(){
	
	System.out.println("this is has a ralation"+storage.systemName+storage.systemPrice);
	
	
}





}