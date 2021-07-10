package in.practice.ajinkya.teamlead;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.tml")
public class TeamleadData {
	private Integer tid;
	private Double tsal;
	private String tname;
	private String tloc;
}
