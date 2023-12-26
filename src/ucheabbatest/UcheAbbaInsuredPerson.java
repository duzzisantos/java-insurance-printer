/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucheabbatest;

/**
 *
 * @author Duzie Uche-Abba
 * @authored on March 18, 2023
 * @lastEdited on March 19, 2023
 */
import java.util.Date; //We would need a Date class with which date input strings would be converted to ISO format
public class UcheAbbaInsuredPerson { //This class name is for insured person 
    
    //Declaration of variables with which we can form a data model for the InsuredPerson class
    public String ucheAbbaInsuredID;
    public String ucheAbbaInsuredName;
    public String ucheAbbaInsuredDOB;
    public String ucheAbbaInsuredAddress;
    public String ucheAbbaInsuredEmail;
    
    //These are the setter  methods that assign data
    
    public void setInsuredID(String id){ //Sets insurance ID as string
        ucheAbbaInsuredID = id;
    }
    
    public void setInsuredName(String name){ //Sets name of the insured as string
        ucheAbbaInsuredName = name;
    }
    
    public void setInsuredDOB(String dob){ //Initially sets the date of birth as string
        ucheAbbaInsuredDOB = dob;
    }
   
    public void setInsuredAddress(String address){ // Sets the insured person's address as string
        ucheAbbaInsuredAddress = address;
    }
    
    public void setInsuredEmail(String email){ // Sets the insured person's email address as string
        ucheAbbaInsuredEmail = email;
    }
    
   //These are the getter methods that return the data
    
    public String getInsuredID(){ //Returns and obtains the insurance ID
        return ucheAbbaInsuredID;
    }
    
    public String getInsuredName(){ //Returns and obtains the insured name
        return ucheAbbaInsuredName;
    }
    
    public Date getInsuredDOB(){ //Returns and obtains the insured person's date of birth by parsing string from the seInsuredDOB() as a new Date() argument
        return new Date(ucheAbbaInsuredDOB);
    }
    
    public String getInsuredAddress(){ //Returns the insured person's address
        return ucheAbbaInsuredAddress;
    }
    
    public String getInsuredEmail(){ //Returns the insured person's email address
        return ucheAbbaInsuredEmail;
    }
    
    //This methods ensures that all output is in string format
   
    @Override // override annotation helps to ensure that method signature are compatible with overriden methods
    public String toString(){
        return ("Insured ID: " + ucheAbbaInsuredID + "\n" //We implement "\n" so that each returned result is positioned on the next line
                + "Insured Name: " + ucheAbbaInsuredName + "\n"
                + "Insured DOB: " + ucheAbbaInsuredDOB + "\n"
                + "Insured Address: " + ucheAbbaInsuredAddress + "\n"
                + "Insured email: " + ucheAbbaInsuredEmail);
    }
    
    //this.toString() calls this class' overrriden toString() method to yield the desired output
      public void getOutput(){
       System.out.println(this.toString());
}
}
