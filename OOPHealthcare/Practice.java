package healthcare;

import java.util.ArrayList;

public class Practice {
    ArrayList <Consultant> consultants=new ArrayList();

    public Practice() {
    }

    public ArrayList<Consultant> getConsultants() {
        return consultants;
    }

    public void setConsultants(ArrayList<Consultant> consultant) {
        consultants = consultant;
    }
    void AddConsultant(Consultant e)
    {
        consultants.add(e);
    }
    void RemoveConsultant(int index)
    {
        consultants.remove(index);
    }
    void printDoctorsList()
    {
        for(int i=0; i<consultants.size();i++)
        {
            System.out.println("Consultant's name is: "+ consultants.get(i).name.firstName+" "+consultants.get(i).name.middleName+" "+consultants.get(i).name.lastName);
        }
    }
}
