package in.practice.ajinkya.teamlead;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Profile("qa")
@ConfigurationProperties("my.tml")
public class TeamleadData {
	private Integer tid;
	private Double tsal;
	private String tname;
	private String tloc;
}
