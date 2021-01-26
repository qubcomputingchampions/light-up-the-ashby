package models;

public enum Shape {
    I,
    J,
    L,
    O,
    S,
    T,
    Z;

    @Override
    public String toString() {
        switch (this) {
            case I:
                return "Shape: I\n" +
                        "Original Colour: turquoise\n" +
                        "Description: 4 blocks down\n";
            case J:
                return "Shape: J\n" +
                        "Original Colour: blue\n" +
                        "Description: 3 blocks down, 1 block left\n";
            case L:
                return "Shape: L\n" +
                        "Original Colour: orange\n" +
                        "Description: 3 blocks down, 1 block right\n";
            case O:
                return "Shape: O\n" +
                        "Original Colour: yellow\n" +
                        "Description: 2 blocks down, 1 block right, 1 block up\n";
            case S:
                return "Shape: S\n" +
                        "Original Colour: green\n" +
                        "Description: 2 blocks right, 1 block up, 1 block right\n";
            case T:
                return "Shape: T\n" +
                        "Original Colour: purple\n" +
                        "Description: 3 blocks right, 1 block left, 1 block down\n";
            case Z:
                return "Shape: Z\n" +
                        "Original Colour: red\n" +
                        "Description: 2 blocks right, 1 block down, 1 block right\n";
            default:
                return "Not a valid shape";
        }
    }
}
