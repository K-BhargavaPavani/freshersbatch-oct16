package mvc.Que8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value="/mvc/login")
	public ModelAndView loginForm() {
		return new ModelAndView("Que8/Login");
	}
	
	
}