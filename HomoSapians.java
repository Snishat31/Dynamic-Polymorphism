package DynamicPolymorphism;

class Monkey{
	Monkey(){
		System.out.println("Class of Monkey");
	}
	
	void Jump(){
		System.out.println("Monkeys Jump");
	}
	
	void Bite(){
		System.out.println("Monkeys Bite");
	}
	void Eat(){
		System.out.println("Monkeys Eat");
	}
	void Sleep(){
		System.out.println("Monkeys sleep");
	}
	
}

class Human extends Monkey{
	void Eat(){
		System.out.println("Humans Eat like monkeys");
	}
	void Sleep(){
		System.out.println("Humans also sleep like monkeys");
	}
}

public class HomoSapians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey a;
		a=new Human();
		a.Jump();
		a.Bite();
		a.Eat();
		a.Sleep();
	}

}
