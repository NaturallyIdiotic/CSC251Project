import java.util.Scanner;

public class Project_Trevor_Bercher
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      int policyNumber = 0, age = 0;
      
      String providerName, firstName, lastName, smokerStatus;
      
      double height = 0.0, weight = 0.0, totalPolicyPrice = 0.0, bmi = 0.0;
      
      // User is prompted to enter the following information
      
      System.out.println("Please enter the Policy number:");
      policyNumber = keyboard.nextInt();
      
      // Clear buffer
      keyboard.nextLine();
      
      System.out.println("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();      
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
     
      System.out.println("Please enter the age of the Policyholder: ");
      age = keyboard.nextInt();
      
      while(age < 1)
      {
         System.out.println("Error invalid data input, age inputted must be greater than 0.");
         
         System.out.println("Please enter the age of the Policyholder: ");
         age = keyboard.nextInt();         
      }
      
      // Clear buffer
      keyboard.nextLine();
                       
      System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokerStatus = keyboard.nextLine();    
      
      while(!smokerStatus.equalsIgnoreCase("smoker") && !smokerStatus.equalsIgnoreCase("non-smoker"))
      {
         System.out.println("Invalid data input please enter either smoker or non-smoker");
         
         System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smokerStatus = keyboard.nextLine();          
      }  
      
      System.out.println("Please enter the PolicyHolder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.println("Please enter the PolicyHolder's Weight (in pounds): ");    
      weight = keyboard.nextDouble();   
      
      // instantiate policy object
      
      Policy policyOne = new Policy(policyNumber, age, providerName, firstName, lastName, smokerStatus, height, weight);
      
      // outputting all data fields as well as the BMI and Policy Price
      
      System.out.println("Policy Number: " + policyOne.getPolicyNumber());
      System.out.println("\nProvider Name: " + policyOne.getProviderName());
      System.out.println("\nPolicyholder's First Name: " + policyOne.getFirstName());
      System.out.println("\nPolicyholder's Last Name: " + policyOne.getLastName());
      System.out.println("\nPolicyHolders's Age: "  + policyOne.getAge());
      System.out.println("\nPolicyHolder's Smoking Status: " + policyOne.getSmokerStatus());
      System.out.printf("\nPolicyHolder's Height: %.1f\n", policyOne.getHeight());
      System.out.printf("\nPolicyHolder's Weight: %.1f\n", policyOne.getWeight());
      System.out.printf("\nPolicyHolder's BMI: %.2f\n", policyOne.getBMI());
      System.out.printf("\nPolicy Price: $%.2f\n", policyOne.getInsurancePolicyPrice());
      
      

   }
}