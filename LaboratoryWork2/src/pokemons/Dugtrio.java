package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Dugtrio extends Pokemon{

    public Dugtrio(String name, int level){
        super(name, level);
        setStats(35,100,50,50,70,120);
        setType(Type.GROUND);
        setMove(new RazorLeaf(), new Swagger());
    }

}
