
public class Person implements Comparable<Person>{

	private int personNr;
	private String lastName;
	private String firstName;
	
	public Person(int personNr, String lastN, String firstN){
		this.personNr = personNr;
		lastName = lastN;
		firstName = firstN;
	}
	
	@Override
	public int compareTo(Person person){
		int personNrVergleich = 0;
		personNrVergleich = Integer.valueOf(this.getPersonNr()).compareTo(person.getPersonNr());
		return personNrVergleich;
	}
	
	@Override 
	public String toString(){
		return personNr + " : " + firstName + " " +  lastName ;
	}

	public int getPersonNr() {
		return personNr;
	}

	public void setPersonNr(int personNr) {
		this.personNr = personNr;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}	
