package models;

public enum Orientation {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    @Override
    public String toString() {
        switch (this) {
            case NORTH:
                return "0";
            case EAST:
                return "90";
            case SOUTH:
                return "180";
            case WEST:
                return "270";
            default:
                return "Not a valid orientation";
        }
    }
}
