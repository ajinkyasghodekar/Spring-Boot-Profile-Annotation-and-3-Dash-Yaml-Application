package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.teamlead.TeamleadData;
@Component
@Profile("qa")
public class TeamleadRunner implements CommandLineRunner {

	@Autowired
	private TeamleadData teamData;
	public void run(String... args) throws Exception {
		System.out.println(teamData);
	}

}
