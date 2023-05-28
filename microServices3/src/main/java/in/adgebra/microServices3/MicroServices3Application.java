package in.adgebra.microServices3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MicroServices3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServices3Application.class, args);
	}

}
