package rest_example.repository;

import rest_example.entity.Pokemon;

import java.util.ArrayList;

public class PokemonRepository {
    ArrayList<Pokemon> pokemons;

    public PokemonRepository(ArrayList<Pokemon> pokemons) {
        this.pokemons = new ArrayList<Pokemon>();
    }
}
