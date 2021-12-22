package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Breloom extends Shroomish {
    public Breloom(String name, int level) {
        super(name, level);

        addType(Type.FIGHTING);
        setStats(60,130,80,60,60,70);
        addMove(new DynamicPunch());
    }
}