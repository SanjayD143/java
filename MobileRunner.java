class MobileRunner{
public static void main(String []args){


long[] mobileNumber=Mobile.network();
for(int number=0;number<mobileNumber.length;number++){	
System.out.println("peoples mobile users  "+mobileNumber[number]);

}



String[] players=Mobile.names();
for(int names=0;names<players.length;names++){
	
	System.out.println("team captain virat kohli "+players[names]);
}	
char[] quality =Mobile.grade();	
for(int number=0;number<quality.length;number++){
	System.out.println("mobile quality"+quality[number]);
	
}

int[] IMEI =Mobile.model();
for(int number=0;number<IMEI.length;number++){
	System.out.println("model name"+IMEI[number]);
}
double[] IP =Mobile.types();
for(int model=0;model<IP.length;model++){
	
	System.out.println("mobile ip address and names  "+IP[model]);
}
	
	float[] names=Mobile.version();
	for(int value=0;value<names.length;value++){
		System.out.println("update version  "+names[value]);
	}
System.out.println();	
	boolean[] condition =Mobile.mobileIsWorking();
		for(int value=0;value<condition.length;value++){
			System.out.println("mobile condition  "+condition[value]);
		}
		
		
}


}