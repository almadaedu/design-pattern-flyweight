package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Trainer> trainers = new ArrayList<>();

    public void capture(String nameTrainer, String namePokemon, String type) {
        Pokemon pokemon = PokemonFactory.getPokemon(namePokemon, type);
        Trainer trainer = new Trainer(nameTrainer, pokemon);
        trainers.add(trainer);
    }

    public List<String> obtainTrainers() {
        List<String> saida = new ArrayList<String>();
        for (Trainer trainer : this.trainers) {
            saida.add(trainer.obtainTrainer());
        }
        return saida;
    }
}
