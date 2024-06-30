package guru.springframework.mssc.breewery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsscBreeweryEurekaApplication {

	public static void main(String[] args) {

		SpringApplication.run(MsscBreeweryEurekaApplication.class, args);
	}

}
