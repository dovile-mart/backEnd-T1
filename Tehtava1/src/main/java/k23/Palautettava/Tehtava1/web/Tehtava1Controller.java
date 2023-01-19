package k23.Palautettava.Tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Tehtava1Controller {
	@RequestMapping("/index")
	public String indexPage() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	public String contactPage() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	public String helloPage(@RequestParam(name="location", required=false, defaultValue="Muumilaakso") String location, @RequestParam(name="name", required=false, defaultValue="Haisuli") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
