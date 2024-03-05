package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
	@Autowired
	private Environment environment;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		String port = environment.getProperty("server.port");
		return "Good Evening ("+port+ ")";
	}

}
