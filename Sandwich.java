
public abstract class Sandwich {
	String description;
	
	public void getDescription() {
		System.out.println(description);
	}
	
	public abstract double cost();
}
