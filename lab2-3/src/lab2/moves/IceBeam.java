package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected String describe() {
        return " съел мятный Dirol и дыхнул";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1) {
            Effect.freeze(pokemon);
        }
    }
}