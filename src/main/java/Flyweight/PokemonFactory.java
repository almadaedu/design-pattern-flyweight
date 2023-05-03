package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PokemonFactory {

    private static Map<String, Pokemon> pokemons = new HashMap<>();

    public static Pokemon getPokemon(String name, String type) {
        Pokemon pokemon = pokemons.get(name);
        if (pokemon == null) {
            pokemon = new Pokemon(name, type);
            pokemons.put(name, pokemon);
        }
        return pokemon;
    }

    public static int getTotalPokemons() {
        return pokemons.size();
    }
}
