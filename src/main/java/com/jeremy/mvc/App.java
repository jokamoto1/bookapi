package com.jeremy.mvc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import com.jeremy.mvc.App;
@SpringBootApplication
@Controller
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(App.class, args);

	}
}
