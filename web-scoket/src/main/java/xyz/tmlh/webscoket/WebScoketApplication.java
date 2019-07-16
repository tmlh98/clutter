package xyz.tmlh.webscoket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan 
@SpringBootApplication
public class WebScoketApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebScoketApplication.class, args);
	}

}
