package healthcare;

public class Person {
    
    Name name;
    String phone;
    String email;

    public Person(Name n, String p, String e) {
        name = n;
        phone = p;
        email = e;
    }

	public Name getName() {
		return name;
	}

	public void setName(Name n) {
		name = n;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String p) {
		phone = p;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String e) {
		email = e;
	}
    
    
    
}
