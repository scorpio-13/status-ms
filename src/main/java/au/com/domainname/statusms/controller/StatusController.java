/**
 * 
 */
package au.com.domainname.statusms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.domainname.statusms.service.StatusService;

/**
 * @author Vasu Nayak
 *
 */
@RestController
@RequestMapping(value = "/status")
public class StatusController {

	@GetMapping
	public ResponseEntity<?> getApplicationStatus() {
		return StatusService.getApplicationStatus();
	}
}
