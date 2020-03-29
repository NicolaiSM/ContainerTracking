package classes;


public class ID {
	
	private String identifier;
	private int incrementer;
	private String id = identifier + "-" + Integer.toString(incrementer);
	
	public ID(Container container, int number) {
		this.identifier = "CON";
		this.incrementer = number;
	}
	
	public ID(Journey journey, int number) {
		this.identifier = "JOU";
		this.incrementer = number;
	}
	
	public ID(int number) {
		this.identifier = "CLI";
		this.incrementer = number;
	}


//	public String getIdentifier() {
//		return identifier;
//	}
//
//	public int getIncrementer() {
//		return incrementer;
//	}

	public String getId() {
		return id;
	}

	
	
	
}