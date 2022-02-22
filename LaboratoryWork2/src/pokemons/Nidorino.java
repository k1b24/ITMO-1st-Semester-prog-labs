package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Nidorino extends Dugtrio {

    public Nidorino(String name, int level){
        super(name, level);
        setStats(61,72,57,55,55,65);
        setType(Type.POISON);
        addMove(new Growth());
    }

}
