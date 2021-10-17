package DynamicPolymorphism;

abstract class Vehicle{
	int speed;
	long distance;
	
	Vehicle(){
		System.out.println("Default Constructor of Vehicle");
		speed=10;
		distance=15;
	}
	
	Vehicle(int speed){
		this.speed=speed;
		distance=35;
	}
	
	abstract void run();
	abstract void stop();
	
	public void fuel(int a){
		speed=a;
		distance=0;
		System.out.println("speed = "+speed);
		System.out.println("distance = "+distance);
	}
	
	public void fuel(float b, String s){
		System.out.println("mileage = "+b);
		System.out.println(" name = "+s);
	}
	
	public void fuel (char c, int a){
		speed=a;
		System.out.println("vehicle type "+c);
		System.out.println("speed = "+speed);
	}
}

class TwoWheel extends Vehicle{
	//int speed;
	//long distance;
	int noTyres;
	
	TwoWheel(){
		speed=20;
		distance=25;
		noTyres=2;
	}
	
	void run(){
		System.out.println("Two wheeler is running");
	}
	void stop(){
		System.out.println("The 2 wheel has stopped running");
	}
	
	void display(){
		System.out.println("\n\nParent vehicle runs with \nspeed = "+super.speed+" \ndistance "+super.distance);
		
		System.out.println("\nthis vehicle runs on 2 wheels with \nspeed = "+speed+" \ndistance "+distance+" \ntyres = "+noTyres);
	}
}

class ThreeWheel extends Vehicle{
	// int speed;
	//int distance;
	int noTyres;
	ThreeWheel(){
		speed=30;
		distance=35;
		noTyres=3;
	}
	void run(){
		System.out.println("Three wheeler is running");
	}
	void stop(){
		System.out.println("The 3 wheel has stopped running");
	}
	void display(){
		System.out.println("\n\nParent vehicle runs with \nspeed = "+super.speed+" \ndistance "+super.distance);
		
		System.out.println("\nthis vehicle runs on 3 wheels with \nspeed = "+speed+" \ndistance "+distance+" \ntyres = "+noTyres);
	}
	
}


class FourWheel extends Vehicle{
	// int speed;
	//int distance;
	int noTyres;
	FourWheel(){
		speed=40;
		distance=45;
		noTyres=4;
	}
	void run(){
		System.out.println("Four wheeler is running");
	}
	void stop(){
		System.out.println("The 4 wheel has stopped running");
	}
	void display(){
		System.out.println("\n\nParent vehicle runs with \nspeed = "+super.speed+" \ndistance "+super.distance);
		
		System.out.println("\n\nthis vehicle runs on 4 wheels with \nspeed = "+speed+" \ndistance "+distance+" \ntyres = "+noTyres);
	}
	
}


class EightWheel extends Vehicle{
	// int speed;
	//int distance;
	int noTyres;
	EightWheel(){
		speed=80;
		distance=85;
		noTyres=8;
	}
	void run(){
		System.out.println("Eight wheeler is running");
	}
	void stop(){
		System.out.println("The 8 wheel has stopped running");
	}
	void display(){
		System.out.println("\n\nParent vehicle runs with \nspeed = "+super.speed+" \ndistance "+super.distance);
		
		System.out.println("\nthis vehicle runs on 8 wheels with \nspeed = "+speed+" \ndistance "+distance+" \ntyres = "+noTyres);
	}
	
}

public class Automobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheel v;
		System.out.println("Creating object to 2 wheeler");
		v=new TwoWheel();
		v.run();
		v.stop();
		v.fuel(13);
		v.display();
		
		System.out.println("Creating object to 3 wheeler");
		ThreeWheel w=new ThreeWheel();
		w.run();
		w.stop();
		w.fuel(3.3f,"Auto");
		w.display();
		
		System.out.println("Creating object to 4 wheeler");
		FourWheel f=new FourWheel();
		f.run();
		f.stop();
		f.fuel('c',46);
		f.display();
		
		System.out.println("Creating object to 8 wheeler");
		EightWheel e=new EightWheel();
		e.run();
		e.stop();
		e.fuel(8.5f, "Truck");
		e.display();
	}

}
