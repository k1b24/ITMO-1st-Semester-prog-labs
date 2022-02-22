package utility;

public abstract class HeroAbstract {
    private String name;
    //private PositionAbstract position;

    public HeroAbstract(String name) {
        if ((name == null) || (name.isEmpty())) {
            throw new IllegalArgumentException("Некорректное имя ");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    private void reactOnChanges() {
        System.out.println("'" + this.name + "' закричал");
    }

    public void reactOnCataclysm() {
        System.out.println("'" + this.name + "' затряс головой и невольно закрыл лицо руками");
    }

    //реализация unchecked исключения, если методу watch передана пустая ссылка на объект
    public void watch(WatchableInterface watchable) {
        System.out.println("'" + this.name + "' посмотрел на объект: " + watchable.getName());
        watchable.dependentVisibility();
        if (watchable.hasChanged()) {
            reactOnChanges();
        }
    }
}