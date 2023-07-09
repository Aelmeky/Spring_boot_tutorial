package service;

import org.springframework.stereotype.Service;

import model.Employee;
import repo.IEmployeeRepo;

@Service
public class EmployeeServiceImp implements IEmployeeService {

	private IEmployeeRepo empRepo;
	
	public EmployeeServiceImp(IEmployeeRepo empRepo) {
		super();
		this.empRepo = empRepo;
	}
	
	@Override
	public Employee saveEmployee(Employee emp) {
		return empRepo.save(emp);
	}

}
