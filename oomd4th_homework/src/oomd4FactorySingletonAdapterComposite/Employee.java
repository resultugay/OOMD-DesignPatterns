package oomd4FactorySingletonAdapterComposite;

public class Employee {
  private String name_surname;
  private int age;
  private double grade;
  private double salary;
  private double how_many_years;
  private int start_date;
  private double duration_over_time;
  private IRewardCalculationAdapter reward_adapter;
  private RewardFactory reward_factory;
 	
  
  	public Employee() {
  		reward_factory = RewardFactory.getInstance();
  	}
  
  	public void checkForReward() {
	  	System.out.println("\nMontly Checking for " + this.name_surname + "\n");
	  
	  	if(reward_adapter == null)
	  		reward_adapter = RewardFactory.getCalculationMethod(this);
      
	  	double total_reward = reward_adapter.calculateRewardEmployee(this);
	  	System.out.println("Total reward is " + total_reward + "\n");
  	}	
	
  	public void setRewardAdapter(IRewardCalculationAdapter new_reward){
  		this.reward_adapter = new_reward;
     	System.out.println("reward_adapter type for " + this.name_surname + " has been changed to " + new_reward);
  	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getHow_many_years() {
		return how_many_years;
	}

	public void setHow_many_years(double how_many_years) {
		this.how_many_years = how_many_years;
	}

	public int getStart_date() {
		return start_date;
	}

	public void setStart_date(int start_date) {
		this.start_date = start_date;
	}

	public double getDuration_over_time() {
		return duration_over_time;
	}

	public void setDuration_over_time(double duration_over_time) {
		this.duration_over_time = duration_over_time;
	}

	public String getName_surname() {
		return name_surname;
	}

	public void setName_surname(String name_surname) {
		this.name_surname = name_surname;
	}
 
}
