package com.beg.haris;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UdemyMicroServicesSpringLab1Application {
	
	@Autowired TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(UdemyMicroServicesSpringLab1Application.class, args);
	}
	
	@PostConstruct public void init() {
		List<Team> teamList = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		teamList.add(team);

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		teamList.add(team);

		teamRepository.save(teamList);
	}
}
