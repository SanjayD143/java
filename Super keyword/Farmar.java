class Farmar extends Worker{
public int price;
public String farmarName;
public char grade;
public double height;
public long farmarPhoneNumber;
public float farmarSalary;
public boolean isFarmar;

public Farmar(int price,String farmarName,char grade,double height,long farmarPhoneNumber,
float farmarSalary,
boolean isFarmar){
	
	this.price=price;
	super.price=price;
	this.farmarName=farmarName;
	super.workerName=workerName;
	this.grade=grade;
	super.grade=grade;
	this.height=height;
	super.height=height;
	this.farmarPhoneNumber=farmarPhoneNumber;
	super.workerPhoneNumber=workerPhoneNumber;
	this.farmarSalary=farmarSalary;
	super.workerSalary=workerSalary;
	this.isFarmar=isFarmar;
	super.isWorker=isWorker;
	
}

public void displayFarmar(){
	System.out.println("this is formar price"+price);
	System.out.println("this is worker price"+super.price);
	System.out.println("this is formarName"+farmarName);
	System.out.println("this is workerName"+super.workerName);
	System.out.println("this is formar grade"+grade);
	System.out.println("this is worker grade"+super.grade);
	System.out.println("this is formar height"+height);
	System.out.println("this is worker height"+super.height);
	System.out.println("this is formar farmarPhonrNumber"+farmarPhoneNumber);
	System.out.println("this is  workerPhonrNumber"+super.workerPhoneNumber);
	System.out.println("this is formar farmarSalary"+farmarSalary);
	System.out.println("this is formar workerSalary"+super.workerSalary);
	System.out.println("this is formar isFarmarice"+isFarmar);
	System.out.println("this is  isWorker"+super.isWorker);
	
	
}





}