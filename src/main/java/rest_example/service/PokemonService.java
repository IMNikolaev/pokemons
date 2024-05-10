package rest_example.service;

import rest_example.entity.Cottonee;
import rest_example.entity.Passimian;
import rest_example.entity.Pokemon;
import rest_example.repository.PokemonRepository;

import java.util.ArrayList;

public class PokemonService {
    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public ArrayList<Pokemon> getPokemons(){
        return pokemonRepository.getPokemons();
    }

    public Pokemon createCottonee(String name) {
        Pokemon cottonee = new Cottonee(name);
        addPokemon(cottonee);
        return cottonee;
    }

    public Pokemon createPassimian(String name) {
        Pokemon passimian = new Passimian(name);
        addPokemon(passimian);
        return passimian;
    }

    private void addPokemon(Pokemon pokemon) {
        pokemonRepository.addPokemon(pokemon);
    }
}
