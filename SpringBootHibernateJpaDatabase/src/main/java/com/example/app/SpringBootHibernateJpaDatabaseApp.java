package com.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.dao.EmployeeRepository;
import com.example.app.entities.Employee;


@SpringBootApplication(scanBasePackages = {"com.example.app.dao"})
public class SpringBootHibernateJpaDatabaseApp implements CommandLineRunner{	
	
	@Autowired
	private EmployeeRepository employeeDao;
	
	public static void main(String[] args) {		
		SpringApplication.run(SpringBootHibernateJpaDatabaseApp.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
	System.out.println("---------------------------------------------------------------------------------------------");
	
	Employee emp = new Employee();
	emp.setEmail("babu.maddirala@gmail.com");
	emp.setEmployeeName("haribabu");
	emp.setSalary(2000.00);	
	employeeDao.save(emp);
	
		
	}	

}





