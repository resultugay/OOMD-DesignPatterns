package oomd4FactorySingletonAdapterComposite;

public class RewardCalculationDurationAdapter implements IRewardCalculationAdapter {

	@Override
	public double calculateRewardEmployee(Employee employee) {
		
		double reward = employee.getDuration_over_time()*100;
		System.out.println("RewardCalculationDurationAdapter called for " + employee.getName_surname() );		

		System.out.println(employee.getName_surname() + " duration over time is " + employee.getDuration_over_time());
		System.out.println(employee.getName_surname() + " has been rewarded " + reward);
		return reward;
		
	}
	
	 public String toString(){//overriding the toString() method  
		 return "Duration of overtimes Adapter";
	 }
}
