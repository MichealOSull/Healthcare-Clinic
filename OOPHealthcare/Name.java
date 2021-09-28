package healthcare;

public class Name {

    String firstName;
    String middleName;
    String lastName;

    public Name(String fName, String mName, String lName) {
        firstName = fName;
        middleName = mName;
        lastName = lName;
    }
    
    void printName()
    {
        System.out.println(firstName+" "+middleName+" "+lastName);
    }
}
