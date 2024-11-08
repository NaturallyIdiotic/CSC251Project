public class Policy
{
   // Initialize Data Fields
   private int policyNumber;  
   
   private String providerName;
   
   private PolicyHolder pHolder;
   
   private static int numPolicyObj = 0; // static field that belongs to class is utilized to track the number of policy objects
   
   /**
      Constructor that accepts arguments for each data field
      @param policyNum holds the policy number
      @param provideName holds name of provider
      @param p holds the policyholder obj
   */
   
   public Policy(int policyNum, String provideName, PolicyHolder p)
   {
      policyNumber = policyNum;
      
      providerName = provideName;  
      
      pHolder = new PolicyHolder(p); // makes a deep copy of the policy holder object
      
      numPolicyObj += 1; // adds one to the static field numPolicyObj to keep track of the number of objects created.

   }
   /**
      Mutator (setter) method
      @param pN symbol for policy number
   
   */
   public void setPolicyNumber(int pN)
   {
      policyNumber = pN;
   }
   /**
      Accessor (getter) method
      @return the policy number
   */
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   /** 
      Mutator (setter) method
      @param pN representing policy provider name
   */
   public void setProviderName(String pN)
   {
      providerName = pN;
   }
   /**
      Accessor (getter) method
      @return name of policy provider
   */
   public String getProviderName()
   {
      return providerName;
   }
   /**
      Method that calculates and returns the price of the insurance policy
      @return policyPrice the total price of the policy 
   */
   public double getInsurancePolicyPrice()
   {
      
      final double INSURANCE_BASE_FEE = 600.0;
      final double AGE_FEE = 75.0;
      final double SMOKER_FEE = 100.0;
      
      int age = pHolder.getAge();
      
      double bmi = pHolder.getBMI();
      double bmiFee = ( bmi - 35) * 20; 
      double policyPrice = 0.0;
      
      String smoke = pHolder.getSmokerStatus();
      
      // adds base cost of insurance to total policy price
      policyPrice += INSURANCE_BASE_FEE;
      
      // checks if holders age is over 50 and adds age fee if applicable
      if(age > 50)
      {
         policyPrice += AGE_FEE;
      }
      
      // checks smoker status and if the holder is a smoker the smoking fee is added
      if(smoke.equalsIgnoreCase("Smoker"))
      {
         policyPrice += SMOKER_FEE;
      }
      
      if(bmi > 35)
      {
         policyPrice += bmiFee;
      }
      
      return policyPrice;
   }
   /**
      Method to return smokerStatus
      @return smokerStatus
   */
   public String getSmoke()
   {
      return pHolder.getSmokerStatus();
   }
   /**
      Method that returns number of created policy objects
   */
   public int getNumPolicyObj()
   {
      return numPolicyObj;
   }
   /**
      To string method
   */
   public String toString()
   {
      return "Policy Number:  " + policyNumber + "\nProvider Name: " + providerName + pHolder + String.format("Policy Price: $%.2f", getInsurancePolicyPrice()) + "\n";
   }
   
   
                     
   
}