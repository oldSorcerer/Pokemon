package pokemon;

import Type.*;

public class Ivysaur extends Pokemon implements Grass, Poison {

    @Override
    public double height() {
        return 3.03;
    }

    @Override
    public double weight() {
        return 28.7;
    }

    @Override
    public String abilities() {
        return "Overgrow";
    }

    @Override
    public Pokemon evolution() {
        return new Venusaur();
    }

    @Override
    public Class[] Weakness() {
        return new Class[]{Flying.class, Fire.class, Psychic.class, Ice.class};
    }
}
