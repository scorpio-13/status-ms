/**
 * 
 */
package au.com.domainname.statusms.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import au.com.domainname.statusms.model.BuildStatusRO;

/**
 * The Class StatusService.
 *
 * @author Vasu Nayak
 */
@Service
public class StatusService {

	public static ResponseEntity<Map<String, List<BuildStatusRO>>> getApplicationBuildStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
