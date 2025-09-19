class Mobile{
public String mobileName;
public int mobilePrice;
public Storage storage;

public Mobile(String mobileName,int mobilePrice,Storage storage){
this.mobileName=mobileName;
this.mobilePrice=mobilePrice;
this.storage=storage;


}
public void displayMobile(){

System.out.println("this is mobile list"+mobileName);


}



}