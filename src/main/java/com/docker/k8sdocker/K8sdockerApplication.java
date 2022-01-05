package com.docker.k8sdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class K8sdockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sdockerApplication.class, args);
	}

}

@RestController
class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}