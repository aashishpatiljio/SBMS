package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	@Autowired
	private GreetFeignClient greetFeignClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String greetResp = greetFeignClient.invokeGreetApi();
		return greetResp + " Welcome to Aashish's World";
	}

}
