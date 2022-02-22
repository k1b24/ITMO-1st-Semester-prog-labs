package moves;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    
    public RazorLeaf(){
        super(Type.GRASS, 55,95);
    }

    @Override
    protected double calcCriticalHit(Pokemon attacker, Pokemon defender) {
        if (Math.random() < (attacker.getStat(Stat.SPEED)/256.0)) {
            return 2.0;
        }
        else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "использует Razor Leaf";
    }

}
