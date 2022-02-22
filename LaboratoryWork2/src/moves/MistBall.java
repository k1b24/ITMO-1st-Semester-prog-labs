package moves;

import ru.ifmo.se.pokemon.*;

public class MistBall extends SpecialMove{

    public MistBall() {
        super(Type.PSYCHIC, 70,100);
    }
    
    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.5){
            defender.setMod(Stat.SPECIAL_ATTACK , -1);
        }
    }

    @Override
    protected String describe() {
        return "использует Mist Ball";
    }

}