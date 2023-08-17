import pokemon.*;

public class Program {

    private static int damage (Pokemon f1, Pokemon f2){
        Class[] interfaces1 = f1.getClass().getInterfaces();
        Class[] weakness2 = f2.Weakness();
        int dmg = 0;
        for (Class interface1 : interfaces1) {
            for (Class weaknes2 : weakness2)
                if (interface1.equals(weaknes2))
                    dmg++;
        }
        return dmg;
    }

    public static int fight (Pokemon f1, Pokemon f2){
        return damage(f1, f2) - damage(f2, f1);
    }

    public static void main(String[] args) {
        System.out.println(fight(new Charizard(), new Pikachu()));
    }
}
