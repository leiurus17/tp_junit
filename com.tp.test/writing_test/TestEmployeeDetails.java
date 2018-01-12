package writing_test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	
	// Test to check appraisal
	@Test
	public void testCalculatorAppraisal() {
		employee.setName("Naruto");
		employee.setAge(17);
		employee.setMonthlySalary(8000);
		
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}
	
	// Test to check yearly salary
	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Naruto");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double salary = empBusinessLogic.calculateYearSalary(employee);
		assertEquals(96000, salary, 0.0);
	}
}
