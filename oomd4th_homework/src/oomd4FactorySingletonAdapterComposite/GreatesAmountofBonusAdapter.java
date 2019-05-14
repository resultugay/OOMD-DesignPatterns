package oomd4FactorySingletonAdapterComposite;

public class GreatesAmountofBonusAdapter extends RewardCalculationCompositeAdapter {
	
	
	
	public double calculateRewardEmployee(Employee employee) {
		System.out.println("GreatesAmountofBonusAdapter called for " +employee.getName_surname() );		

		// TODO Auto-generated method stub
		double max = 0;
		for (int i = 0; i < reward_adapters.size(); i++) {
			double reward = reward_adapters.get(i).calculateRewardEmployee(employee);
			System.out.println("reward_adapter for " + employee.getName_surname() + " with " + reward_adapters.get(i) + " is " + reward + "\n");
			if (max < reward)
				max = reward;
		}		
		
		return max;
	}
	
	 public String toString(){//overriding the toString() method  
		 return "Greatest Amount Bonus Adapter";
	 }
}
