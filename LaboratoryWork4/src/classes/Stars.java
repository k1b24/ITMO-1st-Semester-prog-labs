package classes;

import utility.SpaceThingInterface;

public class Stars implements SpaceThingInterface {
    private String name;
    private boolean isVisible;

    public Stars(String name) {
        if ((name == null) || (name.isEmpty())) {
            throw new IllegalArgumentException("Некорректное имя ");
        }
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

}