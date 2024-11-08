public class PolicyHolder
{
   // Initialize Data Fields
   private int age;
   
   private String firstName;
   private String lastName;
   private String smokerStatus;
   
   private double height;
   private double weight;
   
   
   /**
      Constructor that accepts arguments for each data field
      @param holderAge holds policy holder age
      @param holderFirstName holds policy holders first name
      @param holderLastName holds policy holders last name
      @param smokeStat holds policy holders smoking status
      @param holderHeight holds policy holders height
      @param holderWeight holds policy holders weight
   
   */
   
   public PolicyHolder(int holderAge, String holderFirstName, String holderLastName, String smokeStat, double holderHeight, double holderWeight)
   {    
      age = holderAge;
       
      firstName = holderFirstName;
      
      lastName = holderLastName;
      
      smokerStatus = smokeStat;
      
      height = holderHeight;
      
      weight = holderWeight;
   }
   
   /**
      No args constructor for Policy class that intializes all data fields with placeholder values or strings
   */
   
   public PolicyHolder()
   { 
      age = 0;
      
      firstName = "placeHolderFirstName";
      
      lastName = "placeHolderLastName";
      
      smokerStatus = "placeHolderSmoker";
      
      height = 0.0;
      
      weight = 0.0;   
   }
   /**
      Copy Constructor
      @param policy holder object
   */
   public PolicyHolder(PolicyHolder obj)
   {
      age = obj.age;
      
      firstName = obj.firstName;
      
      lastName = obj.lastName;
      
      smokerStatus = obj.smokerStatus;
      
      height = obj.height;
      
      weight = obj.weight; 
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
   
}