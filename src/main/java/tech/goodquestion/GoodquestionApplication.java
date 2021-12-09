package tech.goodquestion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GoodquestionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodquestionApplication.class, args);
	}

}
