package Flyweight;

public class Trainer {
    private String name;
    private Pokemon pokemon;

    public Trainer(String name, Pokemon pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }

    public String obtainTrainer() {
        return "Trainer{" +
                "name='" + this.name + '\'' +
                ", pokemon='" + pokemon.getName() + '\'' +
                ", type='" + pokemon.getType() + '\'' +
                '}';
    }
}
