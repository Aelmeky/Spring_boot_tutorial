package springboot.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World";
	}
}
