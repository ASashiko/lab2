package lab2.pokemons;

import lab2.moves.*;
import ru.ifmo.se.pokemon.*;

public class HoOh extends Pokemon {
    public HoOh(String name, int level) {
        super(name, level);

        setType(Type.FIRE, Type.FLYING);
        setStats(106,130,90,11,154,90);
        setMove(new FlameCharge(), new BraveBird(), new Psychic(), new AncientPower());
    }
}