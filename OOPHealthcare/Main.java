package healthcare;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Consultant>consultants=new ArrayList<>();
    static ArrayList<Patient>patients=new ArrayList<>();
    static ArrayList<Visit> visitList=new ArrayList<>();
    static Scanner input=new Scanner(System.in);
    static int inputkey = 0;
    
    void DisplayMenu()
    {
    	
        System.out.println("------Welcome to Cork City Healthcare Clinic------");
        System.out.println();
        System.out.println("You have the following options:");
        System.out.println("1. Create a new consultant.");
        System.out.println("2. Create a new patient linked to a consultant.");
        System.out.println("3. Record a patient's visit with their consultant.");
        System.out.println("4. Display all visits by a patient given by the patient's name.");
        System.out.println("5. Display all patients of a particular consultant.");
        System.out.println("6. Display all consultants followed by their patients followed by their visits.");
        System.out.println();
        System.out.println("Enter any of the above option number to proceed or press 0 to exit.");
        
        inputkey=input.nextInt();
        
                   
            
        }
       
        
    
    
    
    public static void main(String[] args) {
		
    	Main menu = new Main();
    	menu.DisplayMenu();
    	
    	
    	 while(true)
         {
    		 switch(inputkey) {
    		 case 0:
    			 System.out.println("Goodbye!");
    			 return;
    		 case 1:
                 inputkey=123;
                 System.out.println("Enter first name of consultant: ");
                 input.nextLine();
                 String fn=input.nextLine();
                 System.out.println("Enter middle name of consultant: ");
                 String mn=input.nextLine();
                 System.out.println("Enter last name of consultant: ");
                 String ln=input.nextLine();
                 System.out.println("Enter expertise of consultant: ");
                 String expert=input.nextLine();
                 System.out.println("Enter phone number of consultant: ");
                 String pn=input.nextLine();
                 System.out.println("Enter email address of consultant: ");
                 String em=input.nextLine();
                 System.out.println("Enter the consultant's ID code: ");
                 String code = input.next();
                 Name n=new Name(fn,mn,ln);
                 Consultant con=new Consultant(expert,n,pn,em,code);
                 consultants.add(con);
                 con.DisplayConsultant();
                 
                 break;
    		 case 2:
                 inputkey=123;
                 System.out.println("Enter first name of patient: ");
                 input.nextLine();
                 String fn1=input.nextLine();
                 System.out.println("Enter middle name of patient: ");
                 String mn1=input.nextLine();
                
                 System.out.println("Enter last name of patient: ");
                 String ln1=input.nextLine();
                 
                 Name n1=new Name(fn1,mn1,ln1);
                 //display consultants expertise and choose illness 
                 for(int i=0;i<consultants.size();i++)
                 {
                     System.out.println("Consultant: "+consultants.get(i).name.firstName+" "+consultants.get(i).name.lastName+"'s expertise is "+consultants.get(i).expertise);
                 }
                 System.out.println("What is the illness of patient:");
                 String ill=input.nextLine();
                 
                 System.out.println("What is the severity of the illness:");
                 int sev=input.nextInt();
               
                 
                 System.out.println("Enter phone number of patient:");
                 input.nextLine();
                 String pn1=input.nextLine();
                 System.out.println("Enter email address of patient:");
                 String em1=input.nextLine();
                 System.out.println("Enter ID code associated with patient's consultant:");
                 String cCode=input.nextLine();
                 Patient pat=new Patient(ill, sev,n1,pn1,em1,cCode);
                 patients.add(pat);
                 pat.DisplayPatient();
                
                 for(int i=0;i<consultants.size();i++)
                 {
                     if(consultants.get(i).expertise.equalsIgnoreCase(pat.illness))
                     {
                         consultants.get(i).AddPatient(pat);
                   
                     }
                 }
     
             
    		    break;
    		 	case 3:
                 inputkey=123;
                 System.out.println("Enter first name of patient:");
                 input.nextLine();
                 String fn3=input.nextLine();
                 System.out.println("Enter middle name of patient:");
                 String mn3=input.nextLine();
                 System.out.println("Enter last name of patient:");
                 String ln3=input.nextLine();
                 System.out.println("Enter ID code associated with patient's consultant:");
                 String conCode=input.nextLine();
                 
                 
                 for(int i=0;i<patients.size();i++)
                 {
                     if(patients.get(i).name.firstName.equalsIgnoreCase(fn3) && patients.get(i).name.middleName.equalsIgnoreCase(mn3) && patients.get(i).name.lastName.equalsIgnoreCase(ln3))
                     {
                         for(int j=0; j<consultants.size();j++)
                         {
                              if(consultants.get(i).getCode().equalsIgnoreCase(conCode))
                              {
                                 Date d= new Date(2020,8,06);
                                 Visit v=new Visit(conCode,fn3,mn3,ln3,d);
                                 visitList.add(v);
                                 
                                 System.out.println("Visit of patient: "+v.getPffirstname()+" "+v.getPfmiddlename()+" "+v.getPflastname()+" with consultant code: "+v.getConCode()+" is at time "+v.getDate()+".");
                                 System.out.println("");
                                 break;
     
                              }
                         }
                        
                     }
                 }
                      
                 break;
       		 case 4:
                 inputkey=123;
                 System.out.println("Enter first name of patient:");
                 input.nextLine();
                 String fn4=input.nextLine();
                 System.out.println("Enter middle name of patient:");
                 String mn4=input.nextLine();
                 System.out.println("Enter last name of patient:");
                 String ln4=input.nextLine();
                 
                 for(int i=0;i<visitList.size();i++)
                 {
                     if(visitList.get(i).getPffirstname().equalsIgnoreCase(fn4) && visitList.get(i).getPfmiddlename().equalsIgnoreCase(mn4) && visitList.get(i).getPflastname().equalsIgnoreCase(ln4))
                     {
                         
                    	 System.out.println("Visit of patient: "+visitList.get(i).getPffirstname()+" "+visitList.get(i).getPfmiddlename()+" "+visitList.get(i).getPflastname()+" with consultant code: "+visitList.get(i).getConCode()+" is at time "+visitList.get(i).getDate()+"."); 
                    	 System.out.println("");
                    	 
                     }
                 }
                 break;
    		 case 5:
                 inputkey=123;
                 System.out.println("Enter the consultant code to list all patients:");
                 String concode = input.next();
                 
                 
                 for(int i=0;i<patients.size();i++)
                 {
                     if(patients.get(i).getConCode().equalsIgnoreCase(concode))
                     {
                         System.out.println("Patients list is:");
                         System.out.println("-"+patients.get(i).name.firstName+" "+patients.get(i).name.middleName+" "+patients.get(i).name.lastName);
                     }else {
                    	 System.out.println("Consultant not found with this code!");
                     }
                 }
                 
                 for(int i=0;i<consultants.size();i++)
                 {
                     if(consultants.get(i).getCode().equalsIgnoreCase(concode))
                     {
                         System.out.println("Patient's consultant is:");
                         System.out.println("-"+consultants.get(i).name.firstName+" "+consultants.get(i).name.lastName);
                         System.out.println("");
                     }
                 }
                 
                 
                 
                 break;
    		 case 6:
                 inputkey=123;
                 
                
                 
                 System.out.println("Consultant:");
                 for(int i=0;i<consultants.size();i++)
                 {
                     
                         
                         System.out.println(consultants.get(i).name.firstName+" "+consultants.get(i).name.lastName);
                         System.out.println();
                     
                 }
                 
                 System.out.println("Patients:");
                 for(int i=0;i<visitList.size();i++)
                 {
                     
                    	 System.out.println(visitList.get(i).getPffirstname()+" "+visitList.get(i).getPfmiddlename()+" "+visitList.get(i).getPflastname()+" visited consultant with code: "+visitList.get(i).getConCode()+" at "+visitList.get(i).getDate()+".");
                 System.out.println();
                 }
                 
                 break;
    		 default:
                 menu.DisplayMenu();
                 break;
             }
    		     
 
         }
    
         
	}
    
    
}
