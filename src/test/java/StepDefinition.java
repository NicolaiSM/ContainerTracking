import classes.*;
import io.cucumber.java.en.*;

public class StepDefinition {
	//String CompanyName, ID id, String CompanyAddress, Person contactPerson
//	Person Jens = new Person("Jens", "Didreksen", "Jens.didreksen@live.dk");
//	ID company1 = new ID(Netto, 2103343);
//	Client Netto = new Client("Netto", company1 , "Arne jakobsens alé 28", Jens);
	
	@Given("Client name doesnt exist")
	public void client_name_doesnt_exist() {
	    // Write code here that turns the phrase above into concrete action
		Client.testExistence(Netto);

	    
	}

	@Given("Valid information")
	public void valid_information() {
	    // Write code here that turns the phrase above into concrete actions
		
		
	}

	@When("Register client")
	public void register_client() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    
	}

	@Then("create new client with given information")
	public void create_new_client_with_given_information() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("generate uniqe Client ID")
	public void generate_uniqe_Client_ID() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Display Succesful registration")
	public void display_Succesful_registration() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Client name exists")
	public void client_name_exists() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	@Then("Display Name already in use")
	public void display_Name_already_in_use() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Client doesnt exists")
	public void client_doesnt_exists() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Invalid information")
	public void invalid_information() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Client not registered")
	public void client_not_registered() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Display invalid information")
	public void display_invalid_information() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
