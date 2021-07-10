package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.manager.ManagerData;
@Component
@Profile("dev")
public class ManagerRunner implements CommandLineRunner {
	@Autowired
	private ManagerData mngData;
	
	public void run(String... args) throws Exception {
		System.out.println(mngData);
	}
}
