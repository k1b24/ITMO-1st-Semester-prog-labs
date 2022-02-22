package classes;

import utility.WatchableInterface;
import utility.SpaceThingInterface;

import java.util.ArrayList;

public class Illuminator implements WatchableInterface {
    private ArrayList<SpaceThingInterface> watchables = new ArrayList<>();
    private String name;
    private ArrayList<SpaceThingInterface> lastSeenObjects = new ArrayList<>();
    private Boolean isChanged;

    public Illuminator(String name, SpaceThingInterface[] watchables) {
        if ((name == null) || (name.isEmpty())) {
            throw new IllegalArgumentException("Некорректное имя ");
        }
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
                System.out.println("Объект " + thing.getNameAndRelatedObjectsNames() + " не виден из иллюминатора");
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
}
