package mulewithspring.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	private Long id;
	private String title;
	private BigDecimal Salary;
	public String getFirstName() {
		return firstName;
	}
	public Employee() {
	}
	public Employee(String firstName, String lastName, String phoneNumber, String address, Long id, String title,
			BigDecimal salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.id = id;
		this.title = title;
		Salary = salary;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getSalary() {
		return Salary;
	}
	public void setSalary(BigDecimal salary) {
		Salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", id=" + id + ", title=" + title + ", Salary=" + Salary + "]";
	}
	
}
