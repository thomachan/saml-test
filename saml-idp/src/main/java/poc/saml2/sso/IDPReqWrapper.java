package poc.saml2.sso;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class IDPReqWrapper extends HttpServletRequestWrapper{

	public IDPReqWrapper(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		if(name.equals("idp")){
			System.out.println("IDP checking........");
			return "http://idp.ssocircle.com";
		}
		return super.getParameter(name);
	}

}
