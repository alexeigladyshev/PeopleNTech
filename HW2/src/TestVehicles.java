
public class TestVehicles {

	public static void main(String[] args) {
		
		Vehicle bicycle1 = new Bicycle();
		Car car1 = new Car();
		Motorcycle motorcycle1 = new Motorcycle();
		
		bicycle1.makeSound();
		bicycle1.travel();
		bicycle1.carry();
		car1.fillUpTank();
		car1.makeSound();
		car1.travel();
		System.out.println();
		car1.carry();
		System.out.println();
		car1.carry(4);
		System.out.println("The car's horsepower is "+car1.getPower() );
		car1.setPower(6);
		System.out.println("The car's horsepower is "+car1.getPower() );
		car1.setPower(10);
		System.out.println("The car's horsepower NOW is "+car1.getPower() );
		System.out.println();
		motorcycle1.fillUpTank();
		motorcycle1.makeSound();
	}
}
