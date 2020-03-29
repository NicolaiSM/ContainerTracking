package classes;

class Person {
	private String firstname;
	private String lastname;
	private String email;
	
	public Person(String firstname, String lastname, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

class Client {
	
	
	private String CompanyName;
	private ID id;
	private String CompanyAddress;
	private Person ContactPerson;
	
	public Client(String CompanyName, ID id, String CompanyAddress, Person contactPerson) {
		this.CompanyName = CompanyName;
		this.id = id;
		this.CompanyAddress = CompanyAddress;
		ContactPerson = contactPerson;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getCompanyAddress() {
		return CompanyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}

	public Person getContactPerson() {
		return ContactPerson;
	}

	public void setContactPerson(Person contactPerson) {
		ContactPerson = contactPerson;
	}

	public ID getId() {
		return id;
	}
	
	
	
}


