package pokemon;

import Type.*;

public class Charmander extends Pokemon implements Fire {
    @Override
    public double height() {
        return 2.0;
    }

    @Override
    public double weight() {
        return 18.7;
    }

    @Override
    public String abilities() {
        return "Blaze";
    }

    @Override
    public Pokemon evolution() {
        return new Charmeleon();
    }

    @Override
    public Class[] Weakness() {
        return new Class[]{Ground.class, Rock.class, Water.class };
    }
}
