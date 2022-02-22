package classes;

import utility.HeroAbstract;
import utility.SpaceThingInterface;

import java.util.Objects;

public class Stars implements SpaceThingInterface {
    private final String name;
    private boolean isVisible;

    public Stars(String name) {
        this.name = name;
        this.isVisible = true;
        getInStory();
    }

    public void setVisibility(boolean newVisibility) {
        this.isVisible = newVisibility;
    }

    public boolean getVisibility() {
        return isVisible; 
    }

    private void getInStory() {
        System.out.println("'" + name + "' присоединились к истории");
    }

    public void shine() {
        System.out.println("'" + name + "' сверкают в небе со всех сторон");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void shake() {
        System.out.println("'" + this.name + "' пошатнулись");
    }

    @Override
    public String getNameAndRelatedObjectsNames() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name: " + name + ", isVisible: " + isVisible + "]";
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
        Stars otherStars = (Stars) otherObj;

        return name.equals(otherStars.name);
    }
}