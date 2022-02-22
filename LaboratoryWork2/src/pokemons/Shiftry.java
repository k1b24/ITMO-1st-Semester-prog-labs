package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Shiftry extends Arcanine{
    
    public Shiftry(String name, int level){
        super(name, level);
        setStats(90,100,60,90,60,80);
        setType(Type.GRASS, Type.DARK);
        addMove(new RockSlide());
    }

}
