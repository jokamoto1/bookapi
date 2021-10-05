package com.jeremy.mvc;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jeremy.mvc.App;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import javax.servlet.http.HttpSession;
@SpringBootApplication
@Controller
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SpringApplication.run(App.class, args);

	}
}
