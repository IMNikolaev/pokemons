package rest_example;

import rest_example.entity.Pokemon;
import rest_example.repository.PokemonRepository;
import rest_example.service.BattleService;
import rest_example.service.PokemonService;

public class Main {
    public static void main(String[] args) {
        PokemonRepository pokemonRepository = new PokemonRepository();
        PokemonService pokemonService = new PokemonService(pokemonRepository);
        BattleService battleService = new BattleService(pokemonRepository);

        Pokemon pokemon1= pokemonService.createCottonee("Cottonee");
        Pokemon pokemon2= pokemonService.createPassimian("Passimian");
        Pokemon pokemon3= pokemonService.createNuzleaf("Nuzleaf");
        Pokemon pokemon4= pokemonService.createSeedot("Seedot");
        Pokemon pokemon5= pokemonService.createWhimsicott("Whimsicott");

        System.out.println(pokemonService.getPokemons());

        battleService.getBattle();
    }
}