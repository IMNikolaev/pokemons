package rest_example.repository;

import rest_example.entity.Pokemon;

import java.util.ArrayList;

public class PokemonRepository {
    ArrayList<Pokemon> pokemons;

    public PokemonRepository() {
        this.pokemons = new ArrayList<Pokemon>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }
    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }
}
