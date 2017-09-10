//Test class
public class Test {
	
	public static void main(String[] args) {
		//Instantiate each sandwich subclass and various combinations of decorations
		Sandwich sub = new Sub();
		Sandwich regular = new Regular();
		Sandwich cheeseSub = new Cheese(new Sub());
		Sandwich lettuceRegular = new Lettuce(new Sub());
		Sandwich lettuceCheeseRegular = new Lettuce(new Cheese(new Sub()));
		
		//Print the description and cost of each sandwich
		sub.printDescription();
		System.out.println("I cost $" + sub.cost());
		System.out.println("");
		regular.printDescription();
		System.out.println("I cost $" + regular.cost());
		System.out.println("");
		cheeseSub.printDescription();
		System.out.println("I cost $" + cheeseSub.cost());
		System.out.println("");
		lettuceRegular.printDescription();
		System.out.println("I cost $" + lettuceRegular.cost());
		System.out.println("");
		lettuceCheeseRegular.printDescription();
		System.out.println("I cost $" + lettuceCheeseRegular.cost());
		System.out.println("");
	}
	
}
