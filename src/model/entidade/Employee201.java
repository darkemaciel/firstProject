package model.entidade;

public class Employee201 implements Comparable<Employee201> {

	private String name;
	private Double salary;
	
	public Employee201(String name, Double salary) {

		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee201 other) {
		return name.compareTo(other.getName());
	}
	
}
