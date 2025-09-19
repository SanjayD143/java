class Tab{
public String tabName;
public int tabPrice;
public Storage storage;
public Tab(String tabName,int tabPrice,Storage storage){
this.tabName=tabName;
this.tabPrice=tabPrice;
this.storage=storage;


}
public void displayTab(){
	System.out.println("this is tab"+tabPrice);
	
	
}

}