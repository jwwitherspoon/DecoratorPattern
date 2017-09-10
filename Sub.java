//Sub sandwich
public class Sub extends Sandwich {
	//Add description of Sub to description of sandwich
	public Sub() {
		description = description.concat("\nI am a sub sandwich. I am really long.");
	}
	
	@Override
	public double cost() {
		return 5.00;
	}
}
