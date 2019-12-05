/**
 * 
 */
package au.com.domainname.statusms.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * The Class BuildInformationComponent will be a component that will read and
 * hold the build information values from `application.properties`.
 *
 * @author Vasu Nayak
 */
@Component
@ConfigurationProperties("applicationbuildinfo")
public class BuildInformationComponent {

	/** The projectname. */
	private String projectname;

	/** The version. */
	private String version;

	/** The description. */
	private String description;

	/** The buildhash. */
	private String buildhash;

	/**
	 * Instantiates a new builds the information component.
	 */
	public BuildInformationComponent() {
		super();
	}

	/**
	 * Instantiates a new builds the information component.
	 *
	 * @param projectname the projectname
	 * @param version     the version
	 * @param description the description
	 * @param buildhash   the buildhash
	 */
	public BuildInformationComponent(String projectname, String version, String description, String buildhash) {
		super();
		this.projectname = projectname;
		this.version = version;
		this.description = description;
		this.buildhash = buildhash;
	}

	/**
	 * Gets the projectname.
	 *
	 * @return the projectname
	 */
	public String getProjectname() {
		return projectname;
	}

	/**
	 * Sets the projectname.
	 *
	 * @param projectname the new projectname
	 */
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the buildhash.
	 *
	 * @return the buildhash
	 */
	public String getBuildhash() {
		return buildhash;
	}

	/**
	 * Sets the buildhash.
	 *
	 * @param buildhash the new buildhash
	 */
	public void setBuildhash(String buildhash) {
		this.buildhash = buildhash;
	}

}
