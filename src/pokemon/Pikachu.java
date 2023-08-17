package pokemon;

import Type.*;

public class Pikachu extends Pokemon implements Electric {
    @Override
    public double height() {
        return 1.04;
    }

    @Override
    public double weight() {
        return 13.2;
    }

    @Override
    public String abilities() {
        return "Static";
    }

    @Override
    public Pokemon evolution() {
        return new Raichu();
    }

    @Override
    public Class[] Weakness() {
        return new Class[] {Ground.class};
    }
}
