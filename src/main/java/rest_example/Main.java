package rest_example;

import rest_example.entity.Cottonee;
import rest_example.entity.Passimian;
import rest_example.entity.Pokemon;
import rest_example.repository.PokemonRepository;
import rest_example.service.PokemonService;

public class Main {
    public static void main(String[] args) {
        PokemonRepository pokemonRepository = new PokemonRepository();
        PokemonService pokemonService = new PokemonService(pokemonRepository);


        pokemonService.createCottonee("Cottonee");
        pokemonService.createPassimian("Passimian");
        System.out.println(pokemonService.getPokemons());

    }
}