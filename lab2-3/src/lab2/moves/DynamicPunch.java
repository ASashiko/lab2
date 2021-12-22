package lab2.moves;

import ru.ifmo.se.pokemon.*;

public class DynamicPunch extends PhysicalMove {
    public DynamicPunch() {
        super(Type.FIGHTING, 100, 50);
    }

    @Override
    protected String describe() {
        return " боньк!";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
            Effect e = new Effect().chance(0.33).turns((int) Math.round(Math.random()*4)+1).stat(Stat.HP, 40);
            pokemon.setCondition(e);
    }
}