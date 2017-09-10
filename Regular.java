//Regular sandwich
public class Regular extends Sandwich {
	//Add description of Regular to description of sandwich
	public Regular() {
		description = description.concat("\nI am a regular sandwich made with two regular slices of bread.");
	}
	
	@Override
	public double cost() {
		return 3.00;
	}
}
