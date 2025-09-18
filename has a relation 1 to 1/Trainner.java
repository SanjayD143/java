class Trainner{

public String trainnerName;
public int trainnerSalary;
public Trainee trainee;
public Trainner(String trainnerName,int trainnerSalary,Trainee trainee){
	this.trainee=trainee;
    this.trainnerName=trainnerName;
	this.trainnerSalary=trainnerSalary;
	
}

public void displayTrainner(){

	System.out.println("this is trainnerName"+trainnerSalary+","+trainnerName+trainee.noOfStudents+trainee.trainneName);
	
}


}