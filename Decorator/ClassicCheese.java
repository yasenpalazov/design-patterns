package Decorator;

public class ClassicCheese extends BurgerDecorator{

	public ClassicCheese(Burger newBurger) {
		super(newBurger);
		
		System.out.println("Making new burger - Cheeseburger");
	}

	public String getDescription() {
		
		return tempBurger.getDescription() + " with Cheese";
	}
}
