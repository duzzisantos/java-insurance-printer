/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ucheabbatest;

/**
 *
 * @author Duzie Uche-Abba
 * @authored on March 18, 2023
 * @lastEdited on March 19, 2023
 */
import java.util.Scanner;
public class UcheAbbaTest { //This is the class where have the main method that creates new instances of the other two classes

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //This is the main method
        
        //We must declare variables with which we would assign input value from the scanner input stream
        Scanner input = new Scanner(System.in);
        String policyNumber;
        double deathBenefit;
        String issued;
        String expiration;
        String beneficiaryName;
        String insuredID;
        String insuredName;
        String dob;
        String address;
        String email;
        
        //Create new instances of the classes below
        UcheAbbaLifeInsurancePolicy ucheAbbaPolicy = new UcheAbbaLifeInsurancePolicy();
        UcheAbbaInsuredPerson insuredPerson = new UcheAbbaInsuredPerson();
        
        //Initiate prompts that allow user to enter vital information into the input which then parses value in the object methods
        //General flow - 
        //1). Obtain value from the input prompt, 
        //2). For each correpsonding setter, parse appropriate input value as argument - so that the getters are ready to produce data
      
            System.out.println("Type in the policy number and press enter");
            policyNumber = input.nextLine();
            ucheAbbaPolicy.setPolicyNumber(policyNumber);
            
            System.out.println("Type in the issusance date (MM/dd/yyyy), and press enter");
            issued = input.nextLine();
            ucheAbbaPolicy.setIssueDate(issued);
            
            System.out.println("Type in the expiration date (MM/dd/yyyy), and press enter");
            expiration = input.nextLine();
            ucheAbbaPolicy.setExpirationDate(expiration);
            
            System.out.println("Type in the death benefit (amount in USD), and press enter");
            deathBenefit = input.nextDouble();
            ucheAbbaPolicy.setDeathBenefit(deathBenefit);
            
            input.nextLine(); // This extra method called here helps to prevent scanner from overlooking the next item in queue.
            
            System.out.println("Type in the beneficiary name and press enter");
            beneficiaryName = input.nextLine();
            ucheAbbaPolicy.setBeneficiaryName(beneficiaryName);
            
            System.out.println("Type in the insured ID and press enter");
            insuredID = input.nextLine();
            insuredPerson.setInsuredID(insuredID);
            
            System.out.println("Type in the insured name and press enter");
            insuredName = input.nextLine();
            insuredPerson.setInsuredName(insuredName);
            
            System.out.println("Type in the insured DOB (MM//dd/yyyy) and press enter");
            dob = input.nextLine();
            insuredPerson.setInsuredDOB(dob);
            
            System.out.println("Type in the insured address and press enter");
            address = input.nextLine();
            insuredPerson.setInsuredAddress(address);
            
            System.out.println("Type in the insured email and press enter");
            email = input.nextLine();
            insuredPerson.setInsuredEmail(email);
         
            //Let's provide a line spacing to separate the input stream from the output - for neatness sake
            System.out.println("");
            //By calling these output methods, we can output the value of the inputs which have been formatted by the toString() override method
            ucheAbbaPolicy.getOutput();
            insuredPerson.getOutput();
    }
    
}
