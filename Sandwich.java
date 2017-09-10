//Base class for all sandwiches
public abstract class Sandwich {
	//Description field
	protected String description = "I am a sandwich.";
	
	//Getter and setter for description
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Prints the description of the sandwich
	public void printDescription() {
		System.out.println(description);
	}
	
	//Abstract method for computing cost of sandwich
	public abstract double cost();
}
