public class Policy
{
   // Initialize Data Fields
   private int policyNumber;
   private int age;
   
   private String providerName;
   private String firstName;
   private String lastName;
   private String smokerStatus;
   
   private double height;
   private double weight;
   
   
   /**
      Constructor that accepts arguments for each data field
      @param policyNum holds the policy number
      @param holderAge holds policy holder age
      @param provideName holds name of provider
      @param holderFirstName holds policy holders first name
      @param holderLastName holds policy holders last name
      @param smokeStat holds policy holders smoking status
      @param holderHeight holds policy holders height
      @param holderWeight holds policy holders weight
   
   */
   
   public Policy(int policyNum, int holderAge, String provideName, String holderFirstName, String holderLastName, String smokeStat, double holderHeight, double holderWeight)
   {
      policyNumber = policyNum;
      
      age = holderAge;
      
      providerName = provideName;
      
      firstName = holderFirstName;
      
      lastName = holderLastName;
      
      smokerStatus = smokeStat;
      
      height = holderHeight;
      
      weight = holderWeight;
   }
   
   /**
      No args constructor for Policy class that intializes all data fields with placeholder values or strings
   */
   
   public Policy()
   {
      policyNumber = 0;
      
      age = 0;
      
      providerName = "placeHolderProvider";
      
      firstName = "placeHolderFirstName";
      
      lastName = "placeHolderLastName";
      
      smokerStatus = "placeHolderSmoker";
      
      height = 0.0;
      
      weight = 0.0;   
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
      @param a representing policy holder age
   */
   public void setAge(int a)
   {
      age = a;
   }
   /**
      Accessor (getter) method
      @return age of policy holder
   */
   public int getAge()
   {
      return age;
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
      Mutator (setter) method
      @param fN representing first name of policy holder
   */
   public void setFirstName(String fN)
   {
      firstName = fN;
   }
   /**
      Accessor (getter) method
      @return first name of policy holder
   */
   public String getFirstName()
   {
      return firstName;
   }
   /** 
      Mutator (setter) method
      @param lN representing last name of policy holder 
   */
   public void setLastName(String lN)
   {
      lastName = lN;
   }
   /**
      Accessor (getter) method
      @return last name of policy holder
   */
   public String getLastName()
   {
      return lastName;
   }
   /** 
      Mutator (setter) method
      @param s representing smoking status of policy holder
   */
   public void setSmokerStatus(String s)
   {
      smokerStatus = s;
   }
   /**
      Accessor (getter) method
      @return smoking status of policy holder
   */
   public String getSmokerStatus()
   {
      return smokerStatus;
   }
   /** 
      Mutator (setter) method
      @param h representing policy holder height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   /**
      Accessor (getter) method
      @return height of policy holder
   */
   public double getHeight()
   {
      return height;
   }
   /** 
      Mutator (setter) method
      @param w representing policy holder weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   /**
      Accessor (getter) method
      @return weight of policy holder
   */
   public double getWeight()
   {
      return weight;
   }
   /**
      Method that returns the BMI of the policy holder
      @return BMI the body mass index of policy holder
   */
   public double getBMI()
   {
      double bmi = 0.0;
      bmi = ( weight * 703 ) / ( height * height);
      return bmi;
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
      
      double bmi = ( weight * 703 ) / ( height * height);
      double bmiFee = ( bmi - 35) * 20; 
      
      double policyPrice = 0.0;
      
      // adds base cost of insurance to total policy price
      policyPrice += INSURANCE_BASE_FEE;
      
      // checks if holders age is over 50 and adds age fee if applicable
      if(age > 50)
      {
         policyPrice += AGE_FEE;
      }
      
      // checks smoker status and if the holder is a smoker the smoking fee is added
      if(smokerStatus.equalsIgnoreCase("Smoker"))
      {
         policyPrice += SMOKER_FEE;
      }
      
      if(bmi > 35)
      {
         policyPrice += bmiFee;
      }
      
      return policyPrice;
   }
   
                     
   
}