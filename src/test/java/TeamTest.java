import Flyweight.PokemonFactory;
import Flyweight.Team;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
public class TeamTest {
    @Test
    public void shouldReturnTrainers() {
        Team team = new Team();
        team.capture("Jose", "Pikachu", "Eletric");
        team.capture("Maria", "Charmander", "Fire");
        team.capture("Ana", "Bulbassauro", "Grass");
        team.capture("Joao", "Haunter", "Ghost");

        List<String> saida = Arrays.asList(
                "Trainer{name='Jose', pokemon='Pikachu', type='Eletric'}",
                "Aluno{nome='Maria', pokemon='Charmander', type='Fire'}",
                "Aluno{nome='Ana', pokemon='Bulbassauro', type='Grass'}",
                "Aluno{nome='Joao', pokemon='Haunter', type='Ghost'}");

        assertEquals(saida, team.obtainTrainers());
    }

    @Test
    void deveRetornarTotalCidades() {
        Team team = new Team();
        team.capture("Jose", "Pikachu", "Eletric");
        team.capture("Maria", "Charmander", "Fire");
        team.capture("Ana", "Bulbassauro", "Grass");
        team.capture("Joao", "Haunter", "Ghost");

        assertEquals(4, PokemonFactory.getTotalPokemons());
    }
}
