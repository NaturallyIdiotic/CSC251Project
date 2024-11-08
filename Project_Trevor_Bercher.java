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
      PolicyHolder pH;
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
            
            pH = new PolicyHolder(age, firstName, lastName, smokerStatus, height, weight);
            p = new Policy(policyNum, providerName, pH);
            
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
            System.out.println(policyList.get(i));
            
            // obtain total num of smokers and non smokers
            if(policyList.get(i).getSmoke().equalsIgnoreCase("smoker"))
            {
               numSmoker += 1;
            }
            else if(policyList.get(i).getSmoke().equalsIgnoreCase("non-smoker"))
            {
               numNonSmoker += 1;
            }
            
         }
            // Display total number of smokers and non smokers
            System.out.print("There were " + policyList.get(0).getNumPolicyObj() + " Policy objects created." );
            System.out.print("\nThe number of policies with a smoker is: " + numSmoker);
            System.out.print("\nThe number of policies with a non-smoker is: " + numNonSmoker);
            
         
         
      }
      catch(IOException ex)
      {
         System.out.print("There was a problem with the file: " + ex.getMessage());
      }        
      
      

   }
}