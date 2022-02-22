package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Houndoom extends Pokemon{

    public Houndoom(String name, int level){
        super(name, level);
        setStats(75,90,50,110,80,95);
        setType(Type.DARK, Type.FIRE);
        setMove(new Psywave(), new ChargeBeam(), new MistBall(), new IceBeam());
    }
    
}
