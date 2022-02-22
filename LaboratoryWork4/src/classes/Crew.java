package classes;

import utility.HeroAbstract;

public class Crew extends HeroAbstract {
    protected InRocketPosition position;

    public Crew(String name) {
        super(name);
        position = new InRocketPosition("Центр кабины");
    }

    protected void scream() {
        System.out.println("'" + getName() + "' взвизгнул");
    }

    protected void snuggleUpAgainstTheCabinWall() {
        System.out.println("'" + getName() + "' прижался к стене кабины");
        position.setPosition("Стена кабины");
    }
}