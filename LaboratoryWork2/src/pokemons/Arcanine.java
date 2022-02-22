package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Arcanine extends Pokemon{

    public Arcanine(String name, int level){
        super(name, level);
        setStats(90,110,80,100,80,95);
        setType(Type.FIRE);
        setMove(new EnergyBall(), new Facade(), new Slam());
    }
    
}
