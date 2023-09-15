package pokemon;

import Type.*;

public class Charizard extends Pokemon implements Fire, Flying {

    @Override
    public double height() {
        return 5.07;
    }

    @Override
    public double weight() {
        return 199.5;
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
        return new Class[]{Rock.class, Electric.class, Water.class  };
    }



}
