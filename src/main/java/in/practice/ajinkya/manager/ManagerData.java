package in.practice.ajinkya.manager;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.mng")
@Profile("dev")
public class ManagerData {
	private Integer mid;
	private Double msal;
	private String mname;
	private String mloc;
}
