/**
 * 
 */
package au.com.domainname.statusms.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

/**
 * @author Vasu Nayak
 *
 */
class BuildStatusWrapperROTest {

	@Test
	void test() {
		BuildStatusWrapperRO buildStatusWrapperRO = new BuildStatusWrapperRO();
		buildStatusWrapperRO.setStatus(HttpStatus.OK);
		buildStatusWrapperRO.setApplicationBuildStatusMap(new HashMap<>(0));

		assertEquals(HttpStatus.OK, buildStatusWrapperRO.getStatus());
		assertNotNull(buildStatusWrapperRO.getApplicationBuildStatusMap());
	}

}
