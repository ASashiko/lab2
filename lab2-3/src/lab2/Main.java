package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon hoOh = new HoOh("Петух", 1);
        Pokemon shroomish = new Shroomish("Гриб", 1);
        Pokemon breloom = new Breloom("Курогриб", 1);
        Pokemon slakoth = new Slakoth("Ленивец", 1);
        Pokemon vigoroth = new Vigoroth("Бебезян", 1);
        Pokemon slaking = new Slaking("Кинг-Конг", 1);

        b.addAlly(slaking);
        b.addAlly(breloom);
        b.addAlly(slakoth);

        b.addFoe(vigoroth);
        b.addFoe(hoOh);
        b.addFoe(shroomish);

        b.go();
    }
}