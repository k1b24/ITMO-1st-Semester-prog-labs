package moves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove{

    public ChargeBeam() {
        super(Type.ELECTRIC, 50,90);
    }
    
    @Override
    protected void applySelfEffects(Pokemon attacker) {
        if (Math.random() < 0.7){
            attacker.setMod(Stat.SPECIAL_ATTACK , 1);
        }
    }

    @Override
    protected String describe() {
        return "использует Charge Beam";
    }

}