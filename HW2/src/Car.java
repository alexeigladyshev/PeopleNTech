
public class Car extends Vehicle {

	public void fillUpTank(){
		
		System.out.println("Your CAR tank has been filled!");
	}
	
	public void makeSound(){
		
		System.out.println("A car goes \"Zoom zoom\" ");
		System.out.println("A car can also honk its horn");
	}
	public void carry(){
		
		System.out.println("A car can carry up to 4 people");
		System.out.println("A car has to carry at least 1 person");
	}
	public void carry(int passengers){
		
		System.out.println("There are "+passengers+ " in your car");
	}
}
