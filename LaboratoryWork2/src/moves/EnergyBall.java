package moves;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove{
    
    public EnergyBall() {
        super(Type.GRASS, 90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.1){
            defender.setMod(Stat.SPECIAL_DEFENSE , -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Energy Ball";
    }

}
