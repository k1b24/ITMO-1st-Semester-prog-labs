package utility;

import java.util.Objects;

public abstract class HeroAbstract {
    private String name;

    public HeroAbstract(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    protected void reactOnChanges() {
        System.out.println("'" + this.name + "' закричал");
    }

    public void watch(WatchableInterface watchable) {
        System.out.println("'" + this.name + "' посмотрел на объект: " + watchable.getName());
        watchable.dependentVisibility();
        if (watchable.hasChanged()) {
            reactOnChanges();
        }
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
        HeroAbstract otherHeroAbstract = (HeroAbstract) otherObj;

        return name.equals(otherHeroAbstract.name);
    }
}