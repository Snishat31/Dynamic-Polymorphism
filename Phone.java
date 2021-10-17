package DynamicPolymorphism;

abstract class Telephone{
	Telephone(){
		System.out.println("Telephone Constructor");
	}
	
	abstract void lift();
	abstract void disconnected();
}

class SmartPhone extends Telephone{
	SmartPhone(){
		System.out.println("Smart Phone constructor");
	}
	
	void lift(){
		System.out.println("the phone is lifted");
	}
	
	void disconnected(){
		System.out.println("the call is disconnected");
	}
}

public class Phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telephone t;
		System.out.println("Telephone reference created");
		t=new SmartPhone();
		
		t.lift();
		t.disconnected();

	}

}
