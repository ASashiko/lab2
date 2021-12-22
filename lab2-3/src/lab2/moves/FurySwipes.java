package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class FurySwipes extends PhysicalMove {

    public FurySwipes() {
        super(Type.NORMAL, 18, 80);
    }

    @Override
    protected String describe() {
        return " ОРА ОРА ОРА";

    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        double ch = Math.random();
        if (ch>=0 && ch<0.375)
            pokemon.setMod(Stat.HP, 2 * (int) Math.round(v));
        else if (ch>=0.375 && ch<0.75)
            pokemon.setMod(Stat.HP, 3 * (int) Math.round(v));
        else if (ch>=0.75 && ch<0.875)
            pokemon.setMod(Stat.HP, 4 * (int) Math.round(v));
        else
            pokemon.setMod(Stat.HP, 5 * (int) Math.round(v));

    }
}