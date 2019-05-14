package oomd4FactorySingletonAdapterComposite;

public class RewardFactory {
   private static RewardFactory  reward_instance;
   private static IRewardCalculationAdapter RewardCalculationType;
   private RewardFactory() {}
   
   public static RewardFactory getInstance() {
				
	   
	   if(reward_instance == null) {
		    reward_instance = new RewardFactory();
	   }
	   System.out.println("RewardFactory getInstance() called " + reward_instance);
	   return reward_instance;
	   
   }
	
   public static IRewardCalculationAdapter getCalculationMethod(Employee employee) {
	   
	   System.out.println(employee.getName_surname()  + " start date is " + employee.getStart_date());
	   if(employee.getStart_date() <= 15)
		   RewardCalculationType =  new RewardCalculationHowManyYearsAdapter();	
	   else if(employee.getStart_date() > 15 && employee.getStart_date() < 30)
		   RewardCalculationType = new RewardCalculationDurationAdapter();
	   else {
		   RewardCalculationType = new GreatesAmountofBonusAdapter();
		   ((RewardCalculationCompositeAdapter) RewardCalculationType).add(new RewardCalculationHowManyYearsAdapter());
		   ((RewardCalculationCompositeAdapter) RewardCalculationType).add(new RewardCalculationDurationAdapter());
	   }		   
	   return RewardCalculationType;
   }	
   
     // to see we have a singleton object, comment out this method
	 public String toString(){//overriding the toString() method  
		 return "reward_adapter Factory";
	 }
	
}
