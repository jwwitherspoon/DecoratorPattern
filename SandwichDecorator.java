//Base class for all decorators
public class SandwichDecorator extends Sandwich {
	//Sandwich field
	protected Sandwich sandwich;
	
	//Getter and setter for sandwich
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	public void setSandwich(Sandwich sandwich) {
		this.sandwich = sandwich;
	}
	
	@Override
	public double cost() {
		return 0;
	}
}
