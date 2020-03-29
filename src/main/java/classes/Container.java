package classes;



public class Container {
	
	// Should port and destination be in journey instead
	
	private String portOfOrigin;
	private String destination;
	private String content;
	private String clientName;
	private Journey journey;
	private ID id;
	private boolean status = true; //true is available - false means in use
	
	public Container(String portOfOrigin) {
		this.portOfOrigin = portOfOrigin;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	public String getPortOfOrigin() {
		return this.portOfOrigin;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUser() {
		return clientName;
	}
	public void setUser(String clientName) {
		this.clientName = clientName;
	}
	public Journey getJourney() {
		return journey;
	}
	public void setJourney(Journey journey) {
		this.journey = journey;
	}
	public ID getId() {
		return id;
	}
	public void setID(ID id) {
		this.id = id;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
	
	
}


