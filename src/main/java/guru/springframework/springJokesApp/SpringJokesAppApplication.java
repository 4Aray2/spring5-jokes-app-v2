package guru.springframework.springJokesApp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import guru.springframework.springJokesApp.controllers.JokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJokesAppApplication.class, args);
	}
}