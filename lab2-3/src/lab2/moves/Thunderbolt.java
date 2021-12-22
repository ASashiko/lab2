package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove {
    public Thunderbolt() {
        super(Type.ELECTRIC, 90, 100);
    }

    @Override
    protected String describe() {
        return " превратился в Тора(т)!";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            Effect.paralyze(pokemon);
        }
    }
}