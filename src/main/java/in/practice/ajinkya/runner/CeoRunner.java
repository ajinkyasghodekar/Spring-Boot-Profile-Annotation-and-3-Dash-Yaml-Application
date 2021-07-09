package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.ceo.CeoData;

@Component
public class CeoRunner implements CommandLineRunner {

	@Autowired
	private CeoData ceoData;
	public void run(String... args) throws Exception {
		System.out.println(ceoData);
	}
}
