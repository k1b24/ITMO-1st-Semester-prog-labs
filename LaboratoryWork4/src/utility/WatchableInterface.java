package utility;

public interface WatchableInterface {
    
    String getName();

    public Boolean hasChanged();

    public void dependentVisibility();
}
