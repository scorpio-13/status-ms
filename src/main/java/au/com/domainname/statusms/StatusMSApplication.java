package au.com.domainname.statusms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The Class StatusMSApplication starts the Status-Microservice.
 * 
 * @author Vasu Nayak
 */
@SpringBootApplication
public class StatusMSApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(StatusMSApplication.class, args);
	}

}
