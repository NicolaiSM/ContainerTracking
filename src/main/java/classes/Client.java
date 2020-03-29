package classes;

import java.util.*;


public class Client {

	private static LinkedList<String> clientList = new LinkedList<String>();
	
	private Map<String,String> data = new HashMap<String, String>();
	
	
	
//	LinkedList<String> clientList = new LinkedList<String>();
//	private LinkedList<String> clientList;
	
	private String companyName;
	private ID id;
	private String companyAddress;
	private Person contactPerson;
	
	public Client(String companyName, ID id, String CompanyAddress, Person contactPerson) {
		this.companyName = companyName;
//		this.id = id;
//		this.CompanyAddress = CompanyAddress;
//		ContactPerson = contactPerson;
		
		//add to map
		data.put ("companyName", companyName);
		data.put("id", id.toString());
		data.put("companyAddress", companyAddress);
		//add person to map
		data.put("firstName", this.contactPerson.getFirstname());
		data.put("secondName", this.contactPerson.getLastname());
		data.put("e-mail", this.contactPerson.getEmail());
		
	}

	
	

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public Person getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(Person contactPerson) {
		this.contactPerson = contactPerson;
	}

	public ID getId() {
		return id;
	}
	
//	public LinkedList<String> getClientList(){
//		return this.clientList;
//	}
	
	public static boolean testExistence(Client company) {
		
		return clientList.contains(company.companyName); // Referer til database
	}
	
	public boolean validInformation(Client company) {
		
	}
	
	
	
}


