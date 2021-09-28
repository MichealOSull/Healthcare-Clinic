package healthcare;

import java.util.Date;

public class Visit {
    
    String conCode, pffirstname,pfmiddlename,pflastname;
    Date date;

    public Visit(String consultant,String pFirstName,String pMiddleName,String pLastName, Date d) {
        conCode = consultant;
        pffirstname = pFirstName;
        pfmiddlename = pMiddleName;
        pflastname = pLastName;
        date = d;
    }
    
    public String getPffirstname() {
		return pffirstname;
	}
    
    public void setPffirstname(String pFirstName) {
		pfmiddlename = pFirstName;
	}

    

    public String getPfmiddlename() {
		return pfmiddlename;
	}



	public void setPfmiddlename(String pMiddleName) {
		pfmiddlename = pMiddleName;
	}



	public String getPflastname() {
		return pflastname;
	}



	public void setPflastname(String pLastName) {
		pflastname = pLastName;
	}



	public Date getDate() {
        return date;
    }

    public void setDate(Date d) {
        date = d;
    }


	public String getConCode() {
		return conCode;
	}


	public void setConCode(String consultant) {
		conCode = consultant;
	}


}


    