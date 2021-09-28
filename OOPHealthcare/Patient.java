package healthcare;

import java.util.ArrayList;

public class Patient extends Person{
    
    String illness;
    int severity;
    String concode;
    ArrayList<Visit> visitList=new ArrayList();

    public Patient(String ill, int sev, Name name, String phone, String email,String cCode) {
        super(name, phone, email);
        illness = ill;
        severity = sev;
        concode= cCode;
    }

    
    public String getConCode() {
		return concode;
	}


	public void setConCode(String cCode) {
		concode = cCode;
	}


	public String getIllness() {
        return illness;
    }

    public int getSeverity() {
        return severity;
    }

    public ArrayList<Visit> getVisitList() {
        return visitList;
    }

    public void setIllness(String ill) {
        illness = ill;
    }

    public void setSeverity(int sev) {
        severity = sev;
    }

    public void setVisitList(ArrayList<Visit> visitList_p) {
        visitList = visitList_p;
    }
    void AddVisitCon(Visit e)
    {
          visitList.add(e);
    }
    void AddVisit(Visit e, Consultant con)
    {
        visitList.add(e);
        //this adds patient to the consultants list
        con.AddPatient(this);
    }
    void RemoveVisit(int index)
    {
        visitList.remove(index);
    }
    void DisplayPatient()
    {
        System.out.println("Patient name is: "+name.firstName+" "+name.middleName+" "+name.lastName);
        System.out.println("Patient's illness is: "+illness);
        System.out.println("Patient's severity is: "+severity);
        System.out.println("Patient's phone number is: "+phone);
        System.out.println("Patient's email address is:"+email);
        System.out.println("Patient's consultant code is:"+concode);
        System.out.println("");
    }
    void printVisitList()
    {
        System.out.println("Printing visiting list:");
        for(int i=0; i<visitList.size();i++)
        {
           // System.out.println("visit of patient "+name.firstName+" with consultant "+visitList.get(i).getConsultant().name.middleName+" is at time "+visitList.get(i).getDate()+".");
        }
    }
    
}
