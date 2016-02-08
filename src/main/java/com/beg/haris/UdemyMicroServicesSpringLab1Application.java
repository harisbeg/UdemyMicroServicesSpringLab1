package com.beg.haris;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
		Set<Player> players1 = new HashSet<>();
		Set<Player> players2 = new HashSet<>();
		Player player1 = new Player("PlayerName1", "PlayerPosition1");
		Player player2 = new Player("PlayerName2", "PlayerPosition2");
		Player player3 = new Player("PlayerName3", "PlayerPosition3");
		Player player4 = new Player("PlayerName4", "PlayerPosition4");

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotters");
		players1.add(player1);
		players1.add(player2);
		team.setPlayers(players1);
		teamList.add(team);
		
		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		players2.add(player3);
		players2.add(player4);
		team.setPlayers(players2);
		teamList.add(team);

		teamRepository.save(teamList);
	}
}
