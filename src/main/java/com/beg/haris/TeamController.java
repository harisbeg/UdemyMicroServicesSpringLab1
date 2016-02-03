package com.beg.haris;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

	@RequestMapping("/teams")
	public List<Team> getTeams() {
		List<Team> teamList = new ArrayList<>();
		
		Team team = new Team();
		team.setId(0L);
		team.setLocation("Los Angeles");
		team.setName("Lakers");
		teamList.add(team);
		
		team = new Team();
		team.setId(1L);
		team.setLocation("Findley");
		team.setName("Dragons");
		teamList.add(team);

		return teamList;
	}
}
