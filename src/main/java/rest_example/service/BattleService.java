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
        Pokemon pokemon1 = pokemonRepository.getPokemons().get(0);
        Pokemon pokemon2 = pokemonRepository.getPokemons().get(1);
        Pokemon pokemon3 = pokemonRepository.getPokemons().get(2);
        Pokemon pokemon4 = pokemonRepository.getPokemons().get(3);
        Pokemon pokemon5 = pokemonRepository.getPokemons().get(4);
        //p1

        if (battle.BestOfTwo(pokemon1, pokemon2) != null) {

        if (battle.BestOfTwo(pokemon1, pokemon2).equals(pokemon1)){
            p1res+=1;
        }
        if (battle.BestOfTwo(pokemon1, pokemon2).equals(pokemon2)){
            p2res+=1;
        }
    }
        if (battle.BestOfTwo(pokemon1, pokemon3) != null) {
            if (battle.BestOfTwo(pokemon1, pokemon3).equals(pokemon1)) {
                p1res += 1;
            }
            if (battle.BestOfTwo(pokemon1, pokemon3).equals(pokemon3)) {
                p3res += 1;
            }
        }
        if (battle.BestOfTwo(pokemon1, pokemon4) != null) {
            if (battle.BestOfTwo(pokemon1, pokemon4).equals(pokemon1)) {
                p1res += 1;
            }
            if (battle.BestOfTwo(pokemon1, pokemon4).equals(pokemon4)) {
                p4res += 1;
            }
        }
        if (battle.BestOfTwo(pokemon1, pokemon5) != null) {
            if (battle.BestOfTwo(pokemon1, pokemon5).equals(pokemon1)) {
                p1res += 1;
            }
            if (battle.BestOfTwo(pokemon1, pokemon5).equals(pokemon5)) {
                p5res += 1;
            }
        }
        //p2
        if (battle.BestOfTwo(pokemon2, pokemon3) != null) {
            if (battle.BestOfTwo(pokemon2, pokemon3).equals(pokemon2)) {
                p2res += 1;
            }
            if (battle.BestOfTwo(pokemon2, pokemon3).equals(pokemon3)) {
                p3res += 1;
            }
        }
        if (battle.BestOfTwo(pokemon2, pokemon4) != null) {
            if (battle.BestOfTwo(pokemon2, pokemon4).equals(pokemon2)) {
                p2res += 1;
            }
            if (battle.BestOfTwo(pokemon2, pokemon4).equals(pokemon4)) {
                p4res += 1;
            }
        }
        if (battle.BestOfTwo(pokemon2, pokemon5) != null) {
            if (battle.BestOfTwo(pokemon2, pokemon5).equals(pokemon2)) {
                p2res += 1;
            }
            if (battle.BestOfTwo(pokemon2, pokemon5).equals(pokemon5)) {
                p5res += 1;
            }
        }
        //p3
        if (battle.BestOfTwo(pokemon3, pokemon4) != null) {
            if (battle.BestOfTwo(pokemon3, pokemon4).equals(pokemon2)) {
                p3res += 1;
            }
            if (battle.BestOfTwo(pokemon3, pokemon4).equals(pokemon4)) {
                p4res += 1;
            }
        }
        if (battle.BestOfTwo(pokemon3, pokemon5) != null) {
            if (battle.BestOfTwo(pokemon3, pokemon5).equals(pokemon2)) {
                p3res += 1;
            }
            if (battle.BestOfTwo(pokemon3, pokemon5).equals(pokemon5)) {
                p5res += 1;
            }
        }

        //p4
        if (battle.BestOfTwo(pokemon4, pokemon5) != null) {
            if (battle.BestOfTwo(pokemon4, pokemon5).equals(pokemon4)) {
                p4res += 1;
            }
            if (battle.BestOfTwo(pokemon4, pokemon5).equals(pokemon5)) {
                p5res += 1;
            }
        }

        System.out.println(pokemon1.getName() + " выиграл " + p1res + " боёв!");
        System.out.println(pokemon2.getName() + " выиграл " + p2res + " боёв!");
        System.out.println(pokemon3.getName() + " выиграл " + p3res + " боёв!");
        System.out.println(pokemon4.getName() + " выиграл " + p4res + " боёв!");
        System.out.println(pokemon5.getName() + " выиграл " + p5res + " боёв!");
    }
}
