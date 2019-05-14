package oomd4FactorySingletonAdapterComposite;

public class test {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName_surname("resul tugay");
		emp1.setStart_date(3);
		emp1.setAge(28);
		emp1.setDuration_over_time(50);
		emp1.setSalary(5000);
		emp1.setGrade(32);
		emp1.setHow_many_years(5);
		
		Employee emp2 = new Employee();
		emp2.setName_surname("Burcu tugay");
		emp2.setStart_date(23);
		emp2.setAge(30);
		emp2.setDuration_over_time(150);
		emp2.setSalary(7000);
		emp2.setGrade(32);
		emp2.setHow_many_years(10);
		
		emp1.checkForReward();
		emp2.checkForReward();
		
		//System.out.println(emp);
		//System.out.println(emp2);
		
		IRewardCalculationAdapter RewardCalculationType = new GreatesAmountofBonusAdapter();
	   ((RewardCalculationCompositeAdapter) RewardCalculationType).add(new RewardCalculationHowManyYearsAdapter());
	   ((RewardCalculationCompositeAdapter) RewardCalculationType).add(new RewardCalculationDurationAdapter());
		
		emp1.setRewardAdapter(RewardCalculationType);
		emp1.checkForReward();
		
		
		
	}

}
