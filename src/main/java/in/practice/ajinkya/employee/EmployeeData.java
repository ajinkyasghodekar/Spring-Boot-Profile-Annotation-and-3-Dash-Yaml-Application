package in.practice.ajinkya.employee;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.emp")
public class EmployeeData {
	private Integer eid;
	private Double esal;
	private String ename;
	private String eloc;

}
