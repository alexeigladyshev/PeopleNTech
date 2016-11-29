
public abstract class Vehicle {

	private int power = 0;
	
	public String travel(){
	
		return "I am traveling in my abstract vehicle";
	}
	
	public abstract void makeSound();
	public abstract void carry();
	
	public int getPower(){
		
		return power;
	}
	public void setPower(int power){
		
		this.power = power;
	}
	
}
