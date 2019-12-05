/**
 * 
 */
package au.com.domainname.statusms.component;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author Vasu Nayak
 *
 */
class BuildInformationComponentTest {

	@Test
	void testBuildInformationComponent() {
		BuildInformationComponent buildInfo = new BuildInformationComponent();
		buildInfo.setBuildhash("abcde123");
		buildInfo.setDescription("description");
		buildInfo.setProjectname("demo");
		buildInfo.setVersion("1.0.0");

		assertEquals("abcde123", buildInfo.getBuildhash());
		assertEquals("description", buildInfo.getDescription());
		assertEquals("demo", buildInfo.getProjectname());
		assertEquals("1.0.0", buildInfo.getVersion());
	}

	@Test
	void testBuildInformationComponentConstructor() {
		BuildInformationComponent buildInfo = new BuildInformationComponent("demo", "1.0.0", "description", "abcde123");
		assertEquals("abcde123", buildInfo.getBuildhash());
		assertEquals("description", buildInfo.getDescription());
		assertEquals("demo", buildInfo.getProjectname());
		assertEquals("1.0.0", buildInfo.getVersion());
	}

}
