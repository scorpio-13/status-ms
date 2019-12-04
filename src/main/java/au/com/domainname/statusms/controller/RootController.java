/**
 * 
 */
package au.com.domainname.statusms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This rest controller is responsible to fulfill the requests coming to root
 * URL('/')
 * 
 * @author Vasu Nayak
 *
 */
@RestController
public class RootController {

	/**
	 * This method returns a Message when a GET request is sent to root URL.
	 *
	 * @return the message
	 */
	@GetMapping
	public String getMessage() {
		return "Hello World";
	}
}
