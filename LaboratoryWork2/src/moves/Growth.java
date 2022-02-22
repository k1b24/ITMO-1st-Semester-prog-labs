package moves;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove{
    
    public Growth() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker){
        attacker.setMod(Stat.ATTACK , 1);
        attacker.setMod(Stat.SPECIAL_ATTACK , 1);
    }

    @Override
    protected String describe() {
        return "использует Growth";
    }

}
