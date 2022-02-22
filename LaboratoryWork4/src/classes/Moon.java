package classes;

import utility.SpaceThingInterface;

public class Moon implements SpaceThingInterface {
    private String name;
    MoonObj[] objectsOnMoon = new MoonObj[]{new MoonObj("Горные цепи"), new MoonObj("Лунные моря"), new MoonObj("Кратер"), new MoonObj("Ущелье")};;
    private boolean isVisible;

    public Moon(String name) {
        if ((name == null) || (name.isEmpty())) {
            throw new IllegalArgumentException("Некорректное имя ");
        }
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
        String nameAndRelatedObjectsNames = new String();
        nameAndRelatedObjectsNames +="'" + getName() + "' вместе с: ";
        for (MoonObj moonObj : objectsOnMoon) {
            nameAndRelatedObjectsNames += "'" + moonObj.getName() + "' ";
        }
        return nameAndRelatedObjectsNames;
    }

    private interface MoonObjectsInterface {
        String getName();
    }

    private class MoonObj implements MoonObjectsInterface {
        private String name;
        private MoonObj(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }
}
