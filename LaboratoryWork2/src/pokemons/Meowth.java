package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Meowth extends Nidorino{
    
    public Meowth(String name, int level){
        super(name, level);
        setStats(40,45,35,40,40,90);
        setType(Type.NORMAL);
        addMove(new LeafStorm());
    }

}
