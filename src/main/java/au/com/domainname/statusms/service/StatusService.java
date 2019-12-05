/**
 * 
 */
package au.com.domainname.statusms.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import au.com.domainname.statusms.component.BuildInformationComponent;
import au.com.domainname.statusms.controller.StatusController;
import au.com.domainname.statusms.model.BuildStatusRO;
import au.com.domainname.statusms.model.BuildStatusWrapperRO;

/**
 * The Class StatusService puts together the response objects to return to
 * {@link StatusController}.
 *
 * @author Vasu Nayak
 */
@Service
public class StatusService {

	private StatusService() {

	}

	/**
	 * Gets the application build status.
	 *
	 * @param buildInfo the build info
	 * @return the application build status
	 */
	public static ResponseEntity<Map<String, List<BuildStatusRO>>> getApplicationBuildStatus(
			BuildInformationComponent buildInfo) {
		// fail fast
		if (null == buildInfo || StringUtils.isBlank(buildInfo.getProjectname())
				|| StringUtils.isBlank(buildInfo.getVersion()) || StringUtils.isBlank(buildInfo.getDescription())
				|| StringUtils.isBlank(buildInfo.getBuildhash())) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		BuildStatusRO tBuildStatusRO = new BuildStatusRO(buildInfo.getVersion(), buildInfo.getDescription(),
				buildInfo.getBuildhash());
		Map<String, List<BuildStatusRO>> tApplicationBuildStatusMap = new HashMap<>(0);

		tApplicationBuildStatusMap.put(buildInfo.getProjectname(), Arrays.asList(tBuildStatusRO));

		BuildStatusWrapperRO statusInfo = new BuildStatusWrapperRO(HttpStatus.OK, tApplicationBuildStatusMap);
		return new ResponseEntity<>(statusInfo.getApplicationBuildStatusMap(), statusInfo.getStatus());
	}

}
