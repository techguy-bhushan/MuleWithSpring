package mulewithspring.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import mulewithspring.bean.Employee;

@Service
public class EmployeeService {

	public List<Employee> getEmplyeeList() {
		List<Employee> list  = new ArrayList<>();
		list.add(new Employee("Jhon", "Doe", "12365478960", "US", 1l, "Dev", BigDecimal.valueOf(100000)));
		list.add(new Employee("Bhushan", "Uniyal", "12365478960", "INDIA", 2l, "Dev", BigDecimal.valueOf(10000)));
		return list;
	}
	
}
