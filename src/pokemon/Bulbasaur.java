package pokemon;

import Type.*;

public class Bulbasaur extends Pokemon implements Grass, Poison {

    @Override
    public double height() {
        return 2.04;
    }

    @Override
    public double weight() {
        return 15.2;
    }

    @Override
    public String abilities() {
        return "Overgrow";
    }

    @Override
    public Pokemon evolution() {
        return new Ivysaur();
    }

    @Override
    public Class<?>[] Weakness() {
        return new Class[] { Flying.class, Fire.class, Psychic.class, Ice.class};
    }
}
