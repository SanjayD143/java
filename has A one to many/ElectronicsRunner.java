class ElectronicsRunner{
public static void main(String[]args){
	Storage storage=new Storage("ram",1520);
	Storage storage1=new Storage("rom",15200);
	Electronics electronics=new Electronics("washing machine",145630,storage);

Laptop laptop=new Laptop("HP",120000,storage1);
Tab tab=new Tab("Ipad",3500,storage);
Mobile mobile=new Mobile("oppo",20000,storage);
Computer computer=new Computer("lenovo",250000,storage);


electronics.displayElectronics();
laptop.displayLaptop();
tab.displayTab();
mobile.displayMobile();
computer.displayComputer();
}




}