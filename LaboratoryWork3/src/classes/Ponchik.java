package classes;

public class Ponchik extends Crew {

    public Ponchik(String name) {
        super(name);
    }

    public void goUp() {
        position.setPosition("Вверх кабины");
        System.out.println("'" + getName() + "' поднялся кверху");
        System.out.println("'" + getName() + "' : Позиция - " + position.getPosition());
    }

    @Override
    protected void reactOnChanges() {
        System.out.println("'" + getName() + "' закричал и покачал головой");
    }
}
