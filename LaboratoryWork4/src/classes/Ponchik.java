package classes;

public class Ponchik extends Crew {

    public Ponchik(String name) {
        super(name);
        getInStory();
    }

    private void getInStory() {
        System.out.println("'" + getName() + "' присоединяется к истории");
    }

    public void goUp() {
        position.setPosition("Вверх кабины");
        System.out.println("'" + getName() + "' поднялся кверху");
    }
}
