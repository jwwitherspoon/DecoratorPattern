//Lettuce decorator
public class Lettuce extends SandwichDecorator {
	//Add description of Lettuce to description of sandwich
	public Lettuce(Sandwich s) {
		sandwich = s;
		description = sandwich.getDescription().concat("\nI am made with lettuce.");
	}
	
	@Override
	public double cost() {
		return sandwich.cost() + 0.50;
	}
}
