package springboot.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudetController {

	@GetMapping("/student")
	public student getStudent() {
		return new student("hima", "ahmed");
	}
// path variables
	@GetMapping("/student/{firstName}/{lastName}")
	public student studentPathVariable(@PathVariable String firstName,@PathVariable String lastName) {
		return new student(firstName, lastName);
	}
	
	// query varibles 
	@GetMapping("/student/query")
	public student studentQueryVariable(@RequestParam String firstName,@RequestParam String lastName) {
		return new student(firstName, lastName);
	}

}
