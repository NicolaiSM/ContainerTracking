package classes;


public class Journey {
	
	private String portOfOrigin;
	private String destination;
	private ID id;
	public Journey(ID id) {
		this.id = id;
	}
	
	
	
	
	
	
	public String getPortOfOrigin() {
		return portOfOrigin;
	}
	public void setPortOfOrigin(String portOfOrigin) {
		this.portOfOrigin = portOfOrigin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public ID getId() {
		return id;
	}
	public void setId(ID id) {
		this.id = id;
	}
	

	
	
	
	
	
	
}