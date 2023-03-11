package com.ormtiago.ormtiago.Player;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ormtiago.ormtiago.Country.CountryEntityService;
import com.ormtiago.ormtiago.League.LeagueEntityService;
import com.ormtiago.ormtiago.Team.TeamEntityService;


@Controller
public class PlayerController {
	@Autowired
	private PlayerEntityService playerService;
	
	@Autowired
	private TeamEntityService teamService;
	
	@Autowired
	private LeagueEntityService leagueService;
	
	@Autowired
	private CountryEntityService countryService;
	
	
	@GetMapping({ "/players", "/" })
	public String verResultado(Model model ) {
		
		
		
		model.addAttribute("players", playerService.listAllPlayers());	
		return "players";
	}
	
	



	@GetMapping("/players/new")
	public String showFormPlayer(Model model) {

		PlayerEntity pe = new PlayerEntity();
		model.addAttribute("player", pe);
		
		model.addAttribute("teams", teamService.listAllTeams());
		model.addAttribute("leagues", leagueService.listAllLeagues());
		model.addAttribute("countries", countryService.listAllCountries());
		return "create_player";
	}

	@PostMapping("/players")
	public String createPlayer(@ModelAttribute("player") PlayerEntity p) {

		playerService.createPlayer(p);
		return "redirect:/players";
	}

	@GetMapping("/players/edit/{id}")
	public String showFindPlayer(@PathVariable Long id, Model model) {

		model.addAttribute("player", playerService.findPlayerById(id));
		
		model.addAttribute("teams", teamService.listAllTeams());
		model.addAttribute("leagues", leagueService.listAllLeagues());
		model.addAttribute("countries", countryService.listAllCountries());

		return "edit_player";
	}

	@PostMapping("/players/{id}")
	public String updatePlayer(@PathVariable Long id, @ModelAttribute("player") PlayerEntity p, Model model) {

		PlayerEntity playerExist = playerService.findPlayerById(id);

		playerExist.setId(id);
		playerExist.setNombre(p.getNombre());
		playerExist.setApellido(p.getApellido());
		playerExist.setEdad(p.getEdad());
		playerExist.setAltura(p.getAltura());
		playerExist.setPeso(p.getPeso());
		playerExist.setPosicion(p.getPosicion());
		playerExist.setPais(p.getPais());
		playerExist.setEquipo(p.getEquipo());
		playerExist.setLiga(p.getLiga());
		

		playerService.updatePlater(playerExist);

		return "redirect:/players";
	}

	@GetMapping("/players/{id}")
	public String deletePlayer(@PathVariable Long id) {
		playerService.deletePlayer(id);

		return "redirect:/players";
	}
	
	
	
	
	
	

}
