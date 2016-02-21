package poc.saml2.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/service")
public class WebService {
	@RequestMapping("/currency")
	public @ResponseBody String getIndCurrency(){
		return "INR";
	}
	

}
