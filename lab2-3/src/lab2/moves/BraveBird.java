package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class BraveBird extends PhysicalMove {
    public BraveBird() {
        super(Type.FLYING, 120, 100);
    }

    @Override
    protected String describe() {
        return " атаковал, но получил ответный чапалах";
    }

    @Override
    protected void applySelfDamage(Pokemon pokemon,double d) {
        pokemon.setMod(Stat.HP, (int) Math.round(d/3));
    }
}