package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Employee;

public interface IEmployeeRepo extends JpaRepository<Employee, Integer> {
	

}
