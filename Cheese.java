//Cheese decorator
public class Cheese extends SandwichDecorator {
	//Add description of Cheese to description of sandwich
	public Cheese(Sandwich s) {
		sandwich = s;
		description = sandwich.getDescription().concat("\nI am made with cheese.");
	}
	
	@Override
	public double cost() {
		return sandwich.cost() + 0.25;
	}
}
