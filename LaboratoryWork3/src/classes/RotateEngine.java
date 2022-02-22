package classes;

import utility.EngineType;
import utility.HeroAbstract;

import java.util.Objects;

public class RotateEngine {
    private final String name;
    private final EngineType TYPE = EngineType.ROTATE;

    public RotateEngine(String name) {
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Чаф-чаф-чаф-чаф! - запустился двигатель");
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name: " + name + ", TYPE" + TYPE.toString() + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(TYPE);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) {
            return false;
        }
        RotateEngine newRotateEngine = (RotateEngine) otherObj;

        return TYPE.equals(newRotateEngine.TYPE);
    }

}

