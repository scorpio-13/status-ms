/**
 * 
 */
package au.com.domainname.statusms.model;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;

/**
 * The Class BuildStatusWrapperRO.
 *
 * @author Vasu Nayak
 */
public class BuildStatusWrapperRO {

	private HttpStatus status;

	private Map<String, List<BuildStatusRO>> applicationBuildStatusMap;

	/**
	 * Instantiates a new builds the status wrapper RO.
	 */
	public BuildStatusWrapperRO() {
		super();
	}

	/**
	 * Instantiates a new builds the status wrapper RO.
	 *
	 * @param status                    the status
	 * @param applicationBuildStatusMap the application build status map
	 */
	public BuildStatusWrapperRO(HttpStatus status, Map<String, List<BuildStatusRO>> applicationBuildStatusMap) {
		this();
		this.status = status;
		this.applicationBuildStatusMap = applicationBuildStatusMap;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	/**
	 * Gets the application build status map.
	 *
	 * @return the application build status map
	 */
	public Map<String, List<BuildStatusRO>> getApplicationBuildStatusMap() {
		return applicationBuildStatusMap;
	}

	/**
	 * Sets the application build status map.
	 *
	 * @param applicationBuildStatusMap the application build status map
	 */
	public void setApplicationBuildStatusMap(Map<String, List<BuildStatusRO>> applicationBuildStatusMap) {
		this.applicationBuildStatusMap = applicationBuildStatusMap;
	}

}
