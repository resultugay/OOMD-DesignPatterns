package oomd4FactorySingletonAdapterComposite;

public class SumofAllRewardsAdapter extends RewardCalculationCompositeAdapter {
	
	
	
	public double calculateRewardEmployee(Employee employee) {
		System.out.println("SumofAllRewardsAdapter called for " + employee.getName_surname()  );		

		// TODO Auto-generated method stub
		double total = 0;
		for (int i = 0; i < reward_adapters.size(); i++) {
			total += reward_adapters.get(i).calculateRewardEmployee(employee);
		}		
		
		return total;
	}
	
	

}