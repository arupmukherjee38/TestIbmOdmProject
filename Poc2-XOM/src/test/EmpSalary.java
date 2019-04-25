package test;

import com.google.gson.Gson;

public class EmpSalary {

	private Salary salary;
	private Salary salary1;
	private Salary salary2;
	private Salary salary3;
	
	
	public EmpSalary() {
		// TODO Auto-generated constructor stub
		System.out.println("ok");
		
	}
	
	public EmpSalary(Salary salary,Salary salary1,Salary salary2,Salary salary3) {
		// TODO Auto-generated constructor stub
		this.salary=salary;
		this.salary1=salary1;
		this.salary2=salary2;
		this.salary3=salary3;
	}

	
	
	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	public Salary getSalary1() {
		return salary1;
	}

	public void setSalary1(Salary salary1) {
		this.salary1 = salary1;
	}

	public Salary getSalary2() {
		return salary2;
	}

	public void setSalary2(Salary salary2) {
		this.salary2 = salary2;
	}

	public void setSalary3(Salary salary3) {
		this.salary3 = salary3;
	}
	
	public Salary getSalary3() {
		return salary3;
	}
	public String toJson()
	{
		Gson gson = new Gson();
		return gson.toJson(this);
	}
	
	public EmpSalary inputAsString(String input)
	{
		Gson gson = new Gson();
		return gson.fromJson(input, this.getClass());
	}

}
