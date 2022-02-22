package classes;

import utility.WatchableInterface;
import utility.SpaceThingInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Illuminator implements WatchableInterface {
    private final ArrayList<SpaceThingInterface> watchables = new ArrayList<>();
    private final String name;
    private ArrayList<SpaceThingInterface> lastSeenObjects = new ArrayList<>();
    private boolean isChanged;

    public Illuminator(String name,SpaceThingInterface[] watchables) {
        ArrayList<SpaceThingInterface> newSeenObjects = new ArrayList<>();
        for (SpaceThingInterface thing : watchables) {
            this.watchables.add(thing);
            newSeenObjects.add(thing);
        }
        lastSeenObjects = new ArrayList<>(newSeenObjects);
        this.name = name;
        this.isChanged = false;
    }

    @Override
    public void dependentVisibility() {
        ArrayList<SpaceThingInterface> newSeenObjects = new ArrayList<>();
        for (SpaceThingInterface thing : watchables) {
            if (thing.getVisibility()) {
                System.out.println("Объект " + thing.getNameAndRelatedObjectsNames() + " виден в иллюминторе");
                newSeenObjects.add(thing);
            } else {
                if (!thing.getVisibility()) {
                    System.out.println("Объект " + thing.getNameAndRelatedObjectsNames() + " не виден из иллюминатора");
                }
            }
        }
        if (!lastSeenObjects.equals(newSeenObjects)) {
            this.isChanged = true;
        }
    }

    @Override
    public Boolean hasChanged() {
        return this.isChanged;
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name: " + name + ", watchables: " + Arrays.toString(watchables.toArray()) + "]";
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
        Illuminator otherIlluminator = (Illuminator) otherObj;

        return name.equals(otherIlluminator.name);
    }
}
