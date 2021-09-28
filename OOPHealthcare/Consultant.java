package healthcare;

import java.util.ArrayList;

public class Consultant extends Person{
    
    ArrayList<Patient> patients=new ArrayList();
    String expertise;
    String code;
    
    public Consultant(String exp, Name name, String phone, String email, String codeId) {
        super(name, phone, email);
        expertise = exp;
        code = codeId;
    }

    
    
    public String getCode() {
		return code;
	}



	public void setCode(String codeId) {
		code = codeId;
	}



	public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients_p) {
        patients = patients_p;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String exp) {
        expertise = exp;
    }
    
     void AddPatient(Patient e)
    {
        patients.add(e);
    }
    void RemovePatient(int index)
    {
        patients.remove(index);
    }
    void DisplayConsultant()
    {
    	System.out.println("");
        System.out.println("Consultant's name is:"+name.firstName+" "+name.middleName+" "+name.lastName);
        System.out.println("Consultant's expertise is: "+expertise);
        System.out.println("Consultant's phone number is: "+phone);
        System.out.println("Consultant's email address is: "+email);
        System.out.println("Consultant's Code is: "+code);
        System.out.println("");
        }
    void printPatients()
    {
        for(int i=0; i<patients.size();i++)
        {
            System.out.println("Consultant's "+name.middleName+" checks "+patients.get(i).name.firstName+".");
        }
    }
    void printPatientsList()
    {
        for(int i=0; i<patients.size();i++)
        {
            System.out.println("Consultant "+name.middleName+" checks "+patients.get(i).name.firstName+".");
            patients.get(i).printVisitList();
        }
        System.out.println("-----------------------------");
    }
}