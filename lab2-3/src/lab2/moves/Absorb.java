package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20, 100);
    }

    @Override
    protected String describe() {
        return " отрастил потерянную руку";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, -(int) pokemon.getHP()/2);
    }
}