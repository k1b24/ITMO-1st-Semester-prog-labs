package classes;

import utility.PositionAbstract;

public class InRocketPosition extends PositionAbstract {
    private String position ;

    public InRocketPosition(String position) {
        if ((position == null) || (position.isEmpty())) {
            throw new IllegalArgumentException("Некорректная позиция");
        }
        this.position = position;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override 
    public void setPosition(String newPosition) {
        this.position = newPosition;
    }
}
