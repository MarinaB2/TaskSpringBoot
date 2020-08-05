package com.example.TaskSpringBoot;
/*Create a Spring web application.

		Create an Index.html and put it inside the resources/static folder and it will not need a mapping, it will be the default for your server.

		This page must have the following:

		An input field (text box)

		A Greeting button:
		Returns a greeting string to the user, if their put something in the input field it must greet them.

		A reverse button:
		Returns a reverse of the string that they entered.

		The page must use Bootstrap for styling (use a CDN).*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskSpringBootApplication {


	public static void main(String[] args) {
		SpringApplication.run(TaskSpringBootApplication.class, args);
	}



}
