package rest_example.service;

import rest_example.entity.*;
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

    public Pokemon createWhimsicott(String name) {
        Pokemon whimsicott = new Whimsicott(name);
        addPokemon(whimsicott);
        return whimsicott;
    }

    public Pokemon createSeedot(String name) {
        Pokemon seedot = new Seedot(name);
        addPokemon(seedot);
        return seedot;
    }

    public Pokemon createNuzleaf(String name) {
        Pokemon nuzleaf = new Nuzleaf(name);
        addPokemon(nuzleaf);
        return nuzleaf;
    }

    private void addPokemon(Pokemon pokemon) {
        pokemonRepository.addPokemon(pokemon);
    }
}
