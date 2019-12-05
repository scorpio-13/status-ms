/**
 * 
 */
package au.com.domainname.statusms.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Vasu Nayak
 *
 */
class BuildStatusROTest {

	@Test
	void testBuildStatusRO() {
		BuildStatusRO tBuildStatus = new BuildStatusRO();
		tBuildStatus.setLastcommitsha("abcde123");
		tBuildStatus.setDescription("description");
		tBuildStatus.setVersion("1.0.0");

		assertEquals("abcde123", tBuildStatus.getLastcommitsha());
		assertEquals("description", tBuildStatus.getDescription());
		assertEquals("1.0.0", tBuildStatus.getVersion());
	}

	@Test
	void testBuildStatusROConstructor() {
		BuildStatusRO tBuildStatus = new BuildStatusRO("1.0.0", "description", "abcde123");
		assertEquals("abcde123", tBuildStatus.getLastcommitsha());
		assertEquals("description", tBuildStatus.getDescription());
		assertEquals("1.0.0", tBuildStatus.getVersion());
	}
}
