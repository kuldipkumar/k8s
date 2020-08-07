package com.aahana.krishiv.springkubes.k8s.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.datetime.standard.DateTimeContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

@RestController
public class WelcomeController {

	@RequestMapping("/aahana")
	public String welcomeAahana(){
		LocalDate now = LocalDate.now();
		LocalDate birthDay = LocalDate.of(2020, 9, 9);

		long dateDifference = ChronoUnit.DAYS.between(now,birthDay);
		return "Hi Aahana, your b'day is just " + dateDifference + " from today";
	}

	@RequestMapping("/krishiv")
	public String welcomeKrishiv(){
		LocalDate now = LocalDate.now();
		LocalDate dob = LocalDate.of(2019, 02, 03);

		long dateDifference = ChronoUnit.DAYS.between(dob,now);
		return "Hi Krishiv, you are of " + dateDifference + " days today.";
	}

}
