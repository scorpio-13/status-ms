/**
 * 
 */
package au.com.domainname.statusms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.domainname.statusms.component.BuildInformationComponent;
import au.com.domainname.statusms.service.StatusService;

/**
 * This rest controller is responsible to fulfill the requests coming to
 * URL('/status')
 * 
 * @author Vasu Nayak
 *
 */
@RestController
@RequestMapping(value = "/status")
public class StatusController {

	@Autowired
	BuildInformationComponent buildInfo;
	
	/**
	 * Gets the application build status.
	 *
	 * @return the application build status
	 */
	@GetMapping
	public ResponseEntity<?> getApplicationBuildStatus() {
		return StatusService.getApplicationBuildStatus(buildInfo);
	}
}
