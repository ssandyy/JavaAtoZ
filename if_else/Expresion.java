class Expresion{
	public static void main(String[] args) {
	int x=2;
	int y=5;
	int z=0;
	
	if(x==2){
		System.out.println("True");
	}
	if(x!=5){
		System.out.println("True");
	}
	if(x!=5 && y>=5){
		System.out.println("True");
	}
	if(z!=0 || x==2){
		System.out.println("True");
	}
	if(!(y<10)){
		System.out.println("True");
	}
	else{
		System.out.println("False");
	}
	
	}
}