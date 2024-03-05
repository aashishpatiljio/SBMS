package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bind.User;

@RestController
public class MsgRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome Aashish, you are the mightest King in the world my Lord...";
		return msg;		
	}
	
	@GetMapping("get/user")
	public User getUserObj() {
		User u = new User();
		u.setId(101);
		u.setName("Aashish");
		u.setAddr("Pune");
		
		return u;
	}

}
