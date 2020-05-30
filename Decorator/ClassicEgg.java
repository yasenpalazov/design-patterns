package Decorator;

public class ClassicEgg extends BurgerDecorator{

	public ClassicEgg(Burger newBurger) {
		super(newBurger);
		
		System.out.println("Making new burger - ClassicEgg");
	}

	public String getDescription() {
		
		return tempBurger.getDescription() + " with Egg";
	}
} 