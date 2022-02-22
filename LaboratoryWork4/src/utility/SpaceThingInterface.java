package utility;

public interface SpaceThingInterface {
    String getName();

    String getNameAndRelatedObjectsNames();

    void setVisibility(boolean newVisibility);

    boolean getVisibility();

    void shake();
}