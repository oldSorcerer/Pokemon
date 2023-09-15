package pokemon;

import Type.*;

public class Charmeleon extends Pokemon implements Fire {
    @Override
    public double height() {
        return 3.07;
    }

    @Override
    public double weight() {
        return 41.9;
    }

    @Override
    public String abilities() {
        return "Blaze";
    }

    @Override
    public Pokemon evolution() {
        return new Charizard();
    }

    @Override
    public Class<?>[] Weakness() {
        return new Class[]{Ground.class, Rock.class, Water.class  };
    }



}
