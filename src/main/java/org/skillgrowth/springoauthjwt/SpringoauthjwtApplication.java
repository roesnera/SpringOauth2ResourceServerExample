package org.skillgrowth.springoauthjwt;

import org.skillgrowth.springoauthjwt.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class SpringoauthjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringoauthjwtApplication.class, args);
	}

}
