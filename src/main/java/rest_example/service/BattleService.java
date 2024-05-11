package rest_example.service;

import rest_example.entity.Pokemon;
import rest_example.repository.PokemonRepository;
import rest_example.scenario.Battle;

public class BattleService {
    private final PokemonRepository pokemonRepository;

    public BattleService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public void getBattle() {
        Battle battle = new Battle();
        int p1res = 0;
        int p2res = 0;
        int p3res = 0;
        int p4res = 0;
        int p5res = 0;
        for (int i = 0; i < pokemonRepository.getPokemons().size(); i++) {
            Pokemon p1 = pokemonRepository.getPokemons().get(i);
            for (int j = i+1; j < pokemonRepository.getPokemons().size(); j++) {
                Pokemon p2 = pokemonRepository.getPokemons().get(j);
                Pokemon winner = battle.BestOfTwo(p1, p2);
                if (winner != null) {
                    if(winner.equals(p1)) {
                        p1res+=1;
                    }
                    if(winner.equals(p2)) {
                        p2res+=1;
                    }
                }
            }
        }
        System.out.println(p1res + " " + p2res + " " +p3res  + " " + p4res + " " +p5res);
    }
}
