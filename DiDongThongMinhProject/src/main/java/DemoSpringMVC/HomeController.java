package DemoSpringMVC;

import java.lang.annotation.Repeatable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	
	public String Index() {
		return "index";
	}
}
