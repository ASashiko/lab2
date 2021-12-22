package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove {
    public FlameCharge() {
        super(Type.FIRE, 50, 100);
    }

    @Override
    protected String describe() {
        return " поднес зажигалку и подпалил врага";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED, 1);
    }
}