package poc.saml2.sso;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.saml.SAMLEntryPoint;

public class PocMySAMLEntryPoint extends SAMLEntryPoint {


	@Override
	public void commence(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException e)
			throws IOException, ServletException {
		System.out.println("Accessing IDP .......................");

		HttpServletRequestWrapper wrapper = new IDPReqWrapper(request);
		super.commence(wrapper, response, e);
	}

}
