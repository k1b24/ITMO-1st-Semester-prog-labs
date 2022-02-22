package moves;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {

    public IceBeam() {
        super(Type.ICE, 90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon defender){
        if (Math.random() < 0.1){
            Effect.freeze(defender);
        }
    }

    @Override
    protected String describe() {
        return "использует Ice Beam";
    }
    
}
