class Computer{
public static void price(){
System.out.println("computer price");
}

public static void display(){

System.out.println("computer display");
price();
}

public static void ram(){
System.out.println("ram capacity");
display();
}
public static void keyboard(){
System.out.println("keyboard type");
ram();

}

public static void battery(){
System.out.println("battery capacity");
keyboard();
}

}