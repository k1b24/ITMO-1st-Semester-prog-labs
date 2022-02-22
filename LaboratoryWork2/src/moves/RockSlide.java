package moves;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon defender) {
        if (Math.random() < 0.3) {
            Effect.flinch(defender);
        }
    }

    @Override
    protected String describe() {
        return "использует Rock Slide";
    }

}
