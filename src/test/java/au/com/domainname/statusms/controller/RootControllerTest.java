/**
 * 
 */
package au.com.domainname.statusms.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * This JUnit class will test {@link RootController}
 * 
 * @author Vasu Nayak
 *
 */
@SpringBootTest
class RootControllerTest {

	@Mock
	private RootController rootController;

	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	/**
	 * Test method for
	 * {@link au.com.domainname.statusms.controller.RootController#getMessage()} by
	 * mocking the get method.
	 */
	@Test
	void testGetMessage() {
		when(rootController.getMessage()).thenReturn("Hello Testing World"); // TODO
		assertEquals(rootController.getMessage(), "Hello Testing World");
	}

	/**
	 * Test method for
	 * {@link au.com.domainname.statusms.controller.RootController#getMessage()}.
	 */
	@Test
	void testGetMessage2() {
		when(rootController.getMessage()).thenCallRealMethod();
		assertEquals(rootController.getMessage(), "Hello World");
	}

}
