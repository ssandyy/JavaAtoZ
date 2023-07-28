class Mobike
{
	String bn;
	String name;
	int days;
	int charge;
	
	void input()
	{
		System.out.println("Enter the Bike Number: ");
		bn=new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter the Customer Name: ");
		name=new java.util.Scanner(System.in).nextLine();
		System.out.println("Enter the no.of days: ");
		days=new java.util.Scanner(System.in).nextInt();
	}
	
	void compute()
	{
		
		int remainingDays = days;
		int charge1=0;
		int charge2=0;
		int charge3=0;
		
		if (remainingDays>5){
			remainingDays=remainingDays-5;
			charge1=5*500;
		}
		if(remainingDays>5){
				remainingDays=remainingDays-5;
				charge2=5*400;
			}
		charge3=remainingDays*200;
		charge=charge1+charge2+charge3;
	
		
//------------------------------------------------------------------------------------------------------------------
		/*
		int remainingDays = days/5;
		int extraDays = days%5; 
		
		if(remainingDays>=2 ){
			charge = (5*500)+(5*400)+((remainingDays-2)*5+extraDays)*200; // if days more then 10 then {4500 + (Q-2)*5 +R)*200}
		}
		else if(remainingDays == 1){       
			charge = (5*500)+extraDays*400;   //if days less then 10 then remainder will be 1 then (charge of 5 days(2500)+extraDays * 400)
		}
		else{
			charge = ((remainingDays*5)+extraDays)*500; // for 5 or less then 5 days..
		}
		*/
		
//-----------------------------------------------------------------------------------------
		/*
		if((days/5)>=2){
			charge=((5*500) + (5*400)) + ((days-10) *200);
		}
		else if((days/5) == 1){       
			charge = (5*500)+(days%5)*400;   //if days less then 10 then remainder will be 1 then (charge of 5 days(2500)+extraDays * 400)
		}
		else{
			charge = days*500; // for 5 or less then 5 days..
		}
		*/
//---------------------------------------------------------------------------------------
		
		//  using ternary operator:-
		//charge = ((days/5)>=2) ? (((5*500) + (5*400)) + ((days-10) *200)) : (((days/5) == 1) ? ((5*500)+(days%5)*400) : days*500);
		
	}
	
	
	void display(){
		input();
		compute();
		System.out.println("Bike No." + " Name" + " days" + " charge");
		System.out.println(bn+ "    "+name+"  "+ days+ " "+charge);
	}
	
	public static void main(String... b){
		Mobike c = new Mobike();
		c.display();
	}
}