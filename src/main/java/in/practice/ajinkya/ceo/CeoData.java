package in.practice.ajinkya.ceo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.ceo")
@Profile("default")
public class CeoData {
	private Integer cid;
	private Double csal;
	private String cname;
	private String cloc;
}