package oomd4FactorySingletonAdapterComposite;

import java.util.ArrayList;
import java.util.List;

public abstract class RewardCalculationCompositeAdapter implements IRewardCalculationAdapter {

	
	protected List<IRewardCalculationAdapter> reward_adapters = new ArrayList<IRewardCalculationAdapter>();	
	
	
	protected void add(IRewardCalculationAdapter reward_adapter) {
		System.out.println("RewardCalculationCompositeAdapter add called for " + reward_adapter);		

		reward_adapters.add(reward_adapter);
	}
	
	protected void remove(IRewardCalculationAdapter reward_adapter) {
		System.out.println("RewardCalculationCompositeAdapter remove called for " + reward_adapter );		
		reward_adapters.remove(reward_adapter);
	}	
	
	@Override

	public abstract double calculateRewardEmployee(Employee employee);

	 public String toString(){//overriding the toString() method  
		 return "Composite Adapter";
	 }
	
}
