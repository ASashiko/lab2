package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class Shroomish extends Pokemon {
    public Shroomish(String name, int level) {
        super(name, level);

        setType(Type.GRASS);
        setStats(60,40,60,40,60,35);
        setMove(new Absorb(), new Facade(), new Swagger());
    }
}