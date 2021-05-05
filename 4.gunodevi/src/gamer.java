
public class gamer {
  private String firstName;
  private String lastName;
  private String identityNumber;
  private int yearofbirth;
  
  public gamer(String firstName, String lastName, String identityNumber, int yearofbirth) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.identityNumber = identityNumber;
	this.yearofbirth = yearofbirth;
 }

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getIdentityNumber() {
	return identityNumber;
}

public void setIdentityNumberString(String identityNumber) {
	this.identityNumber = identityNumber;
}

public int getYearofbirth() {
	return yearofbirth;
}

public void setYearofbirth(Integer yearofbirth) {
	this.yearofbirth = yearofbirth;
}
  

}
