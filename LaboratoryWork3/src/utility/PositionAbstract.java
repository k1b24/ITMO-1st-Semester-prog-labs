package utility;

import java.util.Objects;

public abstract class PositionAbstract {
    private String position;

    public PositionAbstract(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String newPosition) {
        this.position = newPosition;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[position: " + position + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) {
            return false;
        }
        PositionAbstract otherPositionAbstract = (PositionAbstract) otherObj;

        return position.equals(otherPositionAbstract.position);
    }
}
