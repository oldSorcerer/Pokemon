package pokemon;

import Type.*;

public class Raichu extends Pokemon implements Electric {
    @Override
    public double height() { return 2.07; }

    @Override
    public double weight() { return 66.1; }

    @Override
    public String abilities() {
        return "Static";
    }

    @Override
    public Pokemon evolution() {
        return null;
    }

    @Override
    public Class<?>[] Weakness() {
        return new Class[]{Ground.class};
    }
}
