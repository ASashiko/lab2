package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Slaking extends Vigoroth {
    public Slaking(String name, int level) {
        super(name, level);

        setStats(150,160,100,95,65,100);
        addMove(new Confide());
    }
}