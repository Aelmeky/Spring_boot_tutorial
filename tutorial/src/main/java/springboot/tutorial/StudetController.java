package springboot.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudetController {
	
	@GetMapping("/student")
	public student getStudent() {
		return new student("hima", "ahmed");
	}

}
