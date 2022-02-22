package classes;

import utility.*;

import java.util.Objects;

public class CentrifugalForce implements ThingInterface {
    private final String name;

    public CentrifugalForce(String name) {
        this.name = name;
    }

    protected void getInStory(Crew[] crewMembers) {
        System.out.println("'" + name + "' присоединилась к истории");
        affectToHeroes(crewMembers);
    }

    private void affectToHeroes(Crew [] crewMembers) {
        System.out.println("'" + name + "' начала воздействовать на героев");
        for (Crew crewMember : crewMembers) {
            crewMember.position.setPosition("Стенка кабины");
            System.out.println("'" + crewMember.getName() + "' : Позиция - " + crewMember.position.getPosition());
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name: " + name + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) {
            return false;
        }
        CentrifugalForce otherCentrifugalForce = (CentrifugalForce) otherObj;

        return name.equals(otherCentrifugalForce.name);
    }
}
