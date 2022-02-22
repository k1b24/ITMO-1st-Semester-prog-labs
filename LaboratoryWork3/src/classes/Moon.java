package classes;

import utility.SpaceThingInterface;
import java.util.Objects;

public class Moon implements SpaceThingInterface {
    private final String name;
    private final MoonObj[] objectsOnMoon = new MoonObj[]{new MoonObj("Горные цепи"), new MoonObj("Лунные моря"), new MoonObj("Кратер"), new MoonObj("Ущелье")};;
    private boolean isVisible;

    public Moon(String name) {
        this.name = name;
        getInStory();
        this.isVisible = true;
    }

    public void setVisibility(boolean newVisibility) {
        this.isVisible = newVisibility;
    }

    public boolean getVisibility() {
        return isVisible; 
    }

    private void getInStory() {
        System.out.println("'" + name + "' присоединилась к истории");
    }

    public void shake() {
        System.out.println("'" + this.name + "' пошатнулась");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getNameAndRelatedObjectsNames() {
        StringBuilder nameAndRelatedObjectsNames = new StringBuilder();
        nameAndRelatedObjectsNames.append("'").append(getName()).append("' вместе с: ");
        for (MoonObj moonObj : objectsOnMoon) {
            nameAndRelatedObjectsNames.append("'").append(moonObj.getName()).append("' ");
        }
        return nameAndRelatedObjectsNames.toString();
    }

    @Override
    public String toString() {
        StringBuilder objectsString = new StringBuilder();
        for (MoonObj moonObj : objectsOnMoon) {
            objectsString.append(moonObj.toString()).append(" ");
        }
        return getClass().getName() + "[name: " + name + ", objectsOnMoon: " + objectsString + ", isVisible: " + isVisible + "]";
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
        Moon otherMoon = (Moon) otherObj;

        return name.equals(otherMoon.name);
    }

    private interface MoonObjectsInterface {
        String getName();
    }

    private static class MoonObj implements MoonObjectsInterface {
        private final String name;

        private MoonObj(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
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
            MoonObj otherMoonObj = (MoonObj) otherObj;

            return name.equals(otherMoonObj.name);
        }
    }
}
