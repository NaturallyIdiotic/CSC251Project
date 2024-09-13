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
      @param holderLastName holds polciy holders last name
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
}