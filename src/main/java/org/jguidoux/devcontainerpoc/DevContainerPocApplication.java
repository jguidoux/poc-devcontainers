package org.jguidoux.devcontainerpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DevContainerPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevContainerPocApplication.class, args);
	}


}

@RestController
@RequestMapping("/hello")
class Hello {
  
	@GetMapping
	public String hello() {
		return "hello";
	}
}

