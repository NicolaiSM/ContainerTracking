package classes;


public class ID {
	
	private String identifier;
	private String number;
	private String id = identifier + "-" + number;
	int zeros[] = new int[8];
	public ID(String identifier, int number) {
		this.identifier = identifier;
		String s = Integer.toString(number);
		for (int i=0;i<8;i++) {
			zeros[i]=0;
		}
		for (int j=0;j<s.length();j++) {
			zeros[8-s.length()+j]=s.charAt(j);
		}
		for (int i=0;i<8;i++) {
			this.number += String.valueOf(zeros[i]);
		}
	}


	public String getId() {
		return id;
	}
}