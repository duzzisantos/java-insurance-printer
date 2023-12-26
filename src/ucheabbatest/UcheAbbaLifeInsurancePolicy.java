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
public class UcheAbbaLifeInsurancePolicy { //This class name is for the life insurance policy details
    //Declare variables for which data can be set and obtained from this class
    public String ucheAbbaPolicyNumber;
    public double ucheAbbaDeathBenefit;
    public String ucheAbbaIssueDate;
    public String ucheAbbaExpirationDate;
    public String ucheAbbaBeneficiaryName;
    UcheAbbaInsuredPerson ucheAbbaInsured = new UcheAbbaInsuredPerson();
    
   //These are the setter methods for assigning data values
   public void setPolicyNumber(String policyNumber){ //Sets policy number
       ucheAbbaPolicyNumber = policyNumber;
   }
   
   public void setInsured(String insuredPerson){ //Sets insured person with an object from 'UcheAbbaInsuredPerson' class
       ucheAbbaInsured.ucheAbbaInsuredName = insuredPerson;
   }
   
   public void setDeathBenefit(double userBenefit){ //Sets Death benefit as double - this is monetary value
       ucheAbbaDeathBenefit = userBenefit;
   }
   
   public void setIssueDate(String userDate){ //Sets the issuance date of the policy as string initially
       ucheAbbaIssueDate = userDate;
   }
   
   public void setExpirationDate(String expirationDate){ //Sets policy expiration date as string initially
       ucheAbbaExpirationDate = expirationDate;
   }
   
   public void setBeneficiaryName(String beneficiaryName){ //Sets beneficiary name as string
       ucheAbbaBeneficiaryName = beneficiaryName;
   }
   
   
   
   //These are the gettter methods for returning and obtaining data 
   public String getPolicyNumber() //Returns the policy number
   {
       return ucheAbbaPolicyNumber;
   } 
   
    public String getInsured(){ //Returns the insured person's name
       return ucheAbbaInsured.ucheAbbaInsuredName;
   }
    
   public double getDeathBenefit(){ //Returns the death benefit 
       return ucheAbbaDeathBenefit;
   }
   
   public Date getIssueDate(){ //Returns the issuance date by parsing string value as argument into the new Date()
       return new Date(ucheAbbaIssueDate);
   }
   
   public Date getExpirationDate(){ //Returns the expiration date by parsing string value as argument into the new Date()
       return new Date(ucheAbbaExpirationDate);
   }
   
   public String getBeneficiaryName(){ //Returns beneficiary name
       return ucheAbbaBeneficiaryName;
   }
   
   //Prints the output including the data that has been returned
   
   @Override // override annotation helps to ensure that method signature are compatible with overriden methods
   
   public String toString(){
       return ("Policy Number: " + ucheAbbaPolicyNumber + "\n" // We implement "\n" so that each returned result is positioned on the next line
                + "Issuance Date: " + ucheAbbaIssueDate + "\n"
                + "Expiration Date: " + ucheAbbaExpirationDate + "\n"
                + "Death Benefit: $" + ucheAbbaDeathBenefit + "\n"
                + "Beneficiary: " + ucheAbbaBeneficiaryName);
   }
   
   //this.toString() calls this class' overrriden toString() method to yield the desired output
    public void getOutput(){
       System.out.println(this.toString());
   }
}