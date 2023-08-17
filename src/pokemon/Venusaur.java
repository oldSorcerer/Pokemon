package pokemon;

import Type.*;

public class Venusaur extends Pokemon implements Grass, Poison {

    @Override
    public double height() {
        return 6.07;
    }

    @Override
    public double weight() {
        return 220.5;
    }

    @Override
    public String abilities() {
        return "Overgrow";
    }

    @Override
    public Pokemon evolution() {
        return null;
    }

    @Override
    public Class[] Weakness() {
        return new Class[]{Flying.class, Fire.class, Psychic.class, Ice.class};
    }
}
