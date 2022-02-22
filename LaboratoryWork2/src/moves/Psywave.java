package moves;

import ru.ifmo.se.pokemon.*;

public class Psywave extends SpecialMove{ 
    
    public Psywave(){
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon attacker, Pokemon defender){
        return attacker.getLevel() * (Math.random() + 0.5);
    }

    @Override
    protected String describe() {
        return "использует Psywave";
    }

}
