package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private IEmployeeService empService;

	public EmployeeController(IEmployeeService empService) {
		this.empService = empService;
	}
	
	@PostMapping("employees")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		return new ResponseEntity<Employee>(empService.saveEmployee(emp), HttpStatus.CREATED);
	}

	
}
