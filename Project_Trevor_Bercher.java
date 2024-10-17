import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_Trevor_Bercher
{
   public static void main(String[] args) throws IOException
   {
      // variable declaration
      int policyNum = 0, age = 0, numSmoker = 0, numNonSmoker = 0;
         
      String providerName, firstName, lastName, smokerStatus, line;
         
      double height = 0.0, weight = 0.0, totalPolicyPrice = 0.0, bmi = 0.0; 
      // ArrayList initaliziation
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      // Create variable for policy object   
      Policy p;
      
      try
      {
         // Structure to use the file
         File policyFile = new File("PolicyInformation.txt");
         Scanner input = new Scanner(policyFile); // Creates scanner object named input that reads the input file object
         
         
         //Reading file by lines
         while(input.hasNext())
         {
            policyNum = input.nextInt();
            
            //buffer
            line = input.nextLine();
            
            providerName = input.nextLine();
            firstName = input.nextLine();
            lastName = input.nextLine();
            age = input.nextInt();
            
            //buffer 
            line = input.nextLine();
            
            smokerStatus = input.nextLine();
            height = input.nextDouble();
            weight = input.nextDouble();
            
            p = new Policy(policyNum, age, providerName, firstName, lastName, smokerStatus, height, weight);
            
            policyList.add(p);
            
            // if the input has more data to be read for example a blank line the following occurs
            if(input.hasNext())
            {
               line = input.nextLine();
            }
               
         }
         
         // close input scanner
         input.close();
         
              //outputting all data fields as well as the BMI and Policy Price
      
         for(int i=0; i < policyList.size(); i++)
         {
            System.out.println("Policy Number: " + policyList.get(i).getPolicyNumber());
            System.out.println("\nProvider Name: " + policyList.get(i).getProviderName());
            System.out.println("\nPolicyholder's First Name: " + policyList.get(i).getFirstName());
            System.out.println("\nPolicyholder's Last Name: " + policyList.get(i).getLastName());
            System.out.println("\nPolicyHolders's Age: "  + policyList.get(i).getAge());
            System.out.println("\nPolicyHolder's Smoking Status: " + policyList.get(i).getSmokerStatus());
            System.out.printf("\nPolicyHolder's Height: %.1f\n", policyList.get(i).getHeight());
            System.out.printf("\nPolicyHolder's Weight: %.1f\n", policyList.get(i).getWeight());
            System.out.printf("\nPolicyHolder's BMI: %.2f\n", policyList.get(i).getBMI());
            System.out.printf("\nPolicy Price: $%.2f\n\n\n", policyList.get(i).getInsurancePolicyPrice());
            
            // obtain total num of smokers and non smokers
            if(policyList.get(i).getSmokerStatus().equalsIgnoreCase("smoker"))
            {
               numSmoker += 1;
            }
            else if(policyList.get(i).getSmokerStatus().equalsIgnoreCase("non-smoker"))
            {
               numNonSmoker += 1;
            }
            
         }
            // Display total number of smokers and non smokers
            System.out.print("The number of policies with a smoker is: " + numSmoker);
            System.out.print("\n\nThe number of policies with a non-smoker is: " + numNonSmoker);
            
         
         
      }
      catch(IOException ex)
      {
         System.out.print("There was a problem with the file: " + ex.getMessage());
      }        
      
      

   }
}