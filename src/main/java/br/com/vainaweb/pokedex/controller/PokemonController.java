package br.com.vainaweb.pokedex.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vainaweb.pokedex.model.Pokemon;
import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
	
	 private List<Pokemon> pokemons = new ArrayList<>();

	    @GetMapping
	    public List<Pokemon> listarPokemon() {
	        return pokemons;
	        
	    }
	    @PostConstruct
	    public void init() {
	        Pokemon pokemon1 = new Pokemon();
	        pokemon1.setId(1L);
	        pokemon1.setNome("Cyndaquil");
	        pokemon1.setTipo("fogo");
	        pokemon1.setPoderes(Arrays.asList("Flame charge", "Inferno"));
	        
	        Pokemon pokemon2 = new Pokemon();
	        pokemon2.setId(2L);
	        pokemon2.setNome("Zekrom");
	        pokemon2.setTipo("dragao e eletrico");
	        pokemon2.setPoderes(Arrays.asList("Teravolt", "Fusion Bolt"));
	        
	        pokemons.add(pokemon1);
	        pokemons.add(pokemon2);
	    }

	
}
