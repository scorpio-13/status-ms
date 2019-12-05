/**
 * 
 */
package au.com.domainname.statusms.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import au.com.domainname.statusms.component.BuildInformationComponent;
import au.com.domainname.statusms.model.BuildStatusRO;

/**
 * @author Vasu Nayak
 *
 */
class StatusControllerTest {

	@InjectMocks
	private StatusController statusController;

	@Mock
	private BuildInformationComponent buildInfo;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testStatusController() {
		StatusController statusController = new StatusController();
		ResponseEntity<?> status2 = statusController.getApplicationBuildStatus();
		assertEquals(HttpStatus.NOT_FOUND, status2.getStatusCode());
	}

	@Test
	public void testGetUserById() {
		when(buildInfo.getBuildhash()).thenReturn("someHash");
		when(buildInfo.getDescription()).thenReturn("MyTestProjectDescription");
		when(buildInfo.getProjectname()).thenReturn("MyTestProjectName");
		when(buildInfo.getVersion()).thenReturn("1.0");

		ResponseEntity<?> status2 = statusController.getApplicationBuildStatus();
		assertEquals(HttpStatus.OK, status2.getStatusCode());
		assertNotNull(status2.getBody());

		Map<String, List<BuildStatusRO>> t = (Map<String, List<BuildStatusRO>>) status2.getBody();

		for (Map.Entry<String, List<BuildStatusRO>> me : t.entrySet()) {
			assertEquals("MyTestProjectName", me.getKey());
			for (BuildStatusRO apro : me.getValue()) {
				assertEquals("someHash", apro.getLastcommitsha());
				assertEquals("MyTestProjectDescription", apro.getDescription());
				assertEquals("1.0", apro.getVersion());
			}
		}

	}
}
