package tn.esprit.ExamenSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAspectJAutoProxy
public class ExamenSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenSpringApplication.class, args);
	}

}
