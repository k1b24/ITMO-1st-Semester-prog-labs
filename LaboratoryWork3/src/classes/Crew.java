package classes;

import utility.HeroAbstract;

public class Crew extends HeroAbstract {
    protected InRocketPosition position;

    public Crew(String name) {
        super(name);
        position = new InRocketPosition("Центр кабины");
        getInStory();
    }

    private void getInStory() {
        System.out.println("'" + getName() + "' присоединяется к истории");
    }

    protected void scream() {
        System.out.println("'" + getName() + "' взвизгнул");
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name: " + getName() + ", position: " + position.getPosition() + "]";
    }

}