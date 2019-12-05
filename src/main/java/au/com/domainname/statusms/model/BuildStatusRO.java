/**
 * 
 */
package au.com.domainname.statusms.model;

/**
 * The Class BuildStatusRO.
 *
 * @author Vasu Nayak
 */
public class BuildStatusRO {

	/** The version. */
	private String version;

	/** The description. */
	private String description;

	/** The lastcommitsha. */
	private String lastcommitsha;

	/**
	 * Instantiates a new builds the status RO.
	 */
	public BuildStatusRO() {
		super();
	}

	/**
	 * Instantiates a new builds the status RO.
	 *
	 * @param version       the version
	 * @param description   the description
	 * @param lastcommitsha the lastcommitsha
	 */
	public BuildStatusRO(String version, String description, String lastcommitsha) {
		this();
		this.version = version;
		this.description = description;
		this.lastcommitsha = lastcommitsha;
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
	 * Gets the lastcommitsha.
	 *
	 * @return the lastcommitsha
	 */
	public String getLastcommitsha() {
		return lastcommitsha;
	}

	/**
	 * Sets the lastcommitsha.
	 *
	 * @param lastcommitsha the new lastcommitsha
	 */
	public void setLastcommitsha(String lastcommitsha) {
		this.lastcommitsha = lastcommitsha;
	}

}
