package classes;

public class Dunno extends Crew {

    public Dunno(String name) {
        super(name);
        getInStory();
    }

    private void getInStory() {
        System.out.println("'" + getName() + "' присоединяется к истории");
    }    
}
