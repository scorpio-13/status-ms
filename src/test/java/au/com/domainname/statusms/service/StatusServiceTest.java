/**
 * 
 */
package au.com.domainname.statusms.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;

import au.com.domainname.statusms.component.BuildInformationComponent;

/**
 * @author Vasu Nayak
 *
 */
class StatusServiceTest {

	@Mock
	private BuildInformationComponent buildInfo;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
		when(buildInfo.getBuildhash()).thenReturn("someHash");
		when(buildInfo.getDescription()).thenReturn("MyTestProjectDescription");
		when(buildInfo.getProjectname()).thenReturn("MyTestProjectName");
		when(buildInfo.getVersion()).thenReturn("1.0");

	}

	@Test
	void test() {
		assertEquals(HttpStatus.NOT_FOUND, StatusService.getApplicationBuildStatus(null).getStatusCode());
	}

	@Test
	void testWhenProjectNameIsNull() {
		when(buildInfo.getProjectname()).thenReturn(null);
		assertEquals(HttpStatus.NOT_FOUND, StatusService.getApplicationBuildStatus(buildInfo).getStatusCode());
	}

	@Test
	void testWhenProjectDescriptionIsNull() {
		when(buildInfo.getDescription()).thenReturn(null);
		assertEquals(HttpStatus.NOT_FOUND, StatusService.getApplicationBuildStatus(buildInfo).getStatusCode());
	}

	@Test
	void testWhenProjectBuildHashIsNull() {
		when(buildInfo.getBuildhash()).thenReturn(null);
		assertEquals(HttpStatus.NOT_FOUND, StatusService.getApplicationBuildStatus(buildInfo).getStatusCode());
	}

	@Test
	void testWhenProjectVersionIsNull() {
		when(buildInfo.getVersion()).thenReturn(null);
		assertEquals(HttpStatus.NOT_FOUND, StatusService.getApplicationBuildStatus(buildInfo).getStatusCode());
	}

}
