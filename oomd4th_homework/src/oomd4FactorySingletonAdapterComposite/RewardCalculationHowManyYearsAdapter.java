package oomd4FactorySingletonAdapterComposite;

public class RewardCalculationHowManyYearsAdapter implements IRewardCalculationAdapter {

	@Override
	public double calculateRewardEmployee(Employee employee) {
		double reward = Math.min(employee.getHow_many_years()*100,1000);
		System.out.println("RewardCalculationHowManyYearsAdapter called for " + employee.getName_surname() );	
		System.out.println( employee.getName_surname() + " has been working for " + employee.getHow_many_years());
		System.out.println( employee.getName_surname() + " has been rewarded " + reward);
		return reward;
	}

	
	
	 public String toString(){//overriding the toString() method  
		 return "How many years Adapter";
	 }
}
