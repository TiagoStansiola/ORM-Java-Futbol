package com.ormtiago.ormtiago.League;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ormtiago.ormtiago.Player.PlayerEntityService;

@Controller
public class LeagueController {
	@Autowired
	private LeagueEntityService leagueService;
}
