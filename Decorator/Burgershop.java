package Decorator;

public class Burgershop {
	
	public static void main(String[] args) {
		
		//Making Classic Burger
        
        Burger classicBurger = new Classicburger();				
         
		
        System.out.println("Type of burger made: " + classicBurger.getDescription());
       		         

        
 //Making Egg Burger
        
        Burger classicEgg = new ClassicEgg(new Classicburger());				
         
		
        System.out.println("Type of burger made: " + classicEgg.getDescription());		
         

        
        
 //Making Cheese Burger
        
        Burger cheeseBurger = new ClassicCheese(new Classicburger());
		
         
        System.out.println("Type of burger made: " + cheeseBurger.getDescription());		
         

	}
}
