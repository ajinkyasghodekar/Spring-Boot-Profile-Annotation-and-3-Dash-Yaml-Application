package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.employee.EmployeeData;

@Component
public class EmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeData empData;
	public void run(String... args) throws Exception {
		System.out.println(empData);
	}

}
