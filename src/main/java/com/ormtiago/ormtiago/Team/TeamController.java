package com.ormtiago.ormtiago.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ormtiago.ormtiago.League.LeagueEntityService;
import com.ormtiago.ormtiago.Player.PlayerEntity;

@Controller
public class TeamController {
	@Autowired
	private TeamEntityService teamService;
	
	@GetMapping("/players/newteam")
	public String showFormTeam(Model model) {

		TeamEntity te = new TeamEntity();
		model.addAttribute("team", te);

		return "create_team";
	}
	
	@PostMapping("/teams")
	public String createPlayer(@ModelAttribute("team") TeamEntity t) {

		teamService.createTeam(t);
		return "redirect:/players";
	}
	
	
	
	
}

