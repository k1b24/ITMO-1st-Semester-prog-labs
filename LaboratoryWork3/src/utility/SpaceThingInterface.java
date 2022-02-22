package utility;

public interface SpaceThingInterface extends ThingInterface {
    String getNameAndRelatedObjectsNames();

    void setVisibility(boolean newVisibility);

    boolean getVisibility();

    void shake();
}