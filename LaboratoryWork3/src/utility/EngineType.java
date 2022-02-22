package utility;

public enum EngineType {
    ROTATE("поворот"), FORWARD("вперед"), LAND("назад");

    private final String type;

    EngineType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name: " + name() + ", type: " + type + "]";
    }
}