package classes;

import utility.*;

import java.util.Objects;

public class Rocket implements ThingInterface {
    private final String name;
    private Crew[] crewMembers;
    private final RotateEngine rotateEngineObj = new RotateEngine("Двигатель поворота");

    public Rocket(String name, Crew [] crewMembers) {
        this.name = name;
        getInStory();
        this.crewMembers = crewMembers;
    }

    private void getInStory() {
        System.out.println("'" + name + "' присоединилась к истории");
    }

    public void rotate(CentrifugalForce centrifugalForceObj, SpaceThingInterface spaceThing) {
        rotateEngineObj.startEngine();
        System.out.println("'" + name + "' начала вращаться");
        centrifugalForceObj.getInStory(crewMembers);
        for (Crew crewMember : crewMembers) {
            crewMember.scream();
        }
        spaceThing.setVisibility(false);
        spaceThing.shake();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder crewMembersString = new StringBuilder();
        for (Crew crewMember : crewMembers) {
            crewMembersString.append(crewMember.toString());
        }
        return getClass().getName() + "[name: " + name + ", crewMembers: " + crewMembersString + ", rotateEngineObj: "+ rotateEngineObj.toString() +"]";
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
        Rocket otherRocket = (Rocket) otherObj;

        return name.equals(otherRocket.name);
    }
}