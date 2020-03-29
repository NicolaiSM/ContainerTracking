
import io.cucumber.java.en.*;

import java.util.ArrayList;

import classes.*;

public class StepDefinition {
	int containerIDnumber = 0;
	String portOfNewContainer;
	ID newID;
	Container newContainer;
	ArrayList containers;
    String destination;
	String clientName;
	String content;
	String port;
	Container oldContainer;
	boolean validContainerInformation;
	
//CREATE CONTAINER	
	
	
	@Given("The Current position of the container")
	public void the_Current_position_of_the_container(String portOfNewContainer) {
		this.portOfNewContainer = portOfNewContainer;
	}

	@When("Creating new container")
	public void creating_new_container() {
		this.newContainer = new Container(portOfNewContainer);

	}

	@Then("Generate unique ID")
	public void generate_unique_ID() {
		this.newID = new ID("CON",containerIDnumber);
		containerIDnumber++;
		this.newContainer.setID(this.newID);
	}

	
	@Then("Save it with existing containers")
	public void save_it_with_existing_containers() {
//		change from arraylist to hypernate
		containers.add(this.newContainer);
	}
	
	
	
// REGISTER CONTAINER
	
	
	
	
	@Given("Destination")
	public void destination(String destination) {
		this.destination = destination;
	}

	@Given("Client")
	public void client(String clientName) {
		this.clientName = clientName;
	}

	@Given("Content")
	public void content(String content) {
	    this.content = content;
	}
	
	@Given("Port")
	public void port(String port) {
		this.port = port;
	}

	@Given("Container")
	public void Container(Container container) {
	    this.oldContainer = container;
	    this.newContainer = container;
	}
	
	@When("Registering container")
	public void registering_container() {
//		change from arraylist to hypernate
		int index = containers.indexOf(oldContainer);
		containers.set(index,newContainer);
	}

	@When("New container information is valid")
	public void new_container_information_is_valid() {
		boolean validContainer = containers.contains(this.oldContainer);
		boolean availability = this.oldContainer.getStatus();
		boolean samePort = this.port == this.oldContainer.getPortOfOrigin();
		if (validContainer & availability & samePort) {
			this.validContainerInformation = true;
		}
		else {
			this.validContainerInformation = false;

		}
	}

	@Then("Change container status")
	public void change_container_status() {
	    this.newContainer.setStatus(false);
	    this.newContainer.setContent(this.content);
	    this.newContainer.setDestination(this.destination);
	    this.newContainer.setUser(this.clientName);
		this.newID = new ID("CON",containerIDnumber);
		containerIDnumber++;
	    this.newContainer.setJourney(new Journey(newID));
	}

	@Then("Display that the information is invalid")
	public void display_that_the_information_is_invalid() {
	    System.out.println("The given container information is invalid.");
	}
}
