package models;

import java.util.*;

public class TetrominoRepository {

    private ArrayList<Tetromino> tetrominoes;

    public TetrominoRepository() {
        // Create a collection of the default tetrominoes
        tetrominoes = new ArrayList<>();
        tetrominoes.add(new Tetromino(Shape.I));
        tetrominoes.add(new Tetromino(Shape.J));
        tetrominoes.add(new Tetromino(Shape.L));
        tetrominoes.add(new Tetromino(Shape.O));
        tetrominoes.add(new Tetromino(Shape.S));
        tetrominoes.add(new Tetromino(Shape.T));
        tetrominoes.add(new Tetromino(Shape.Z));
    }

    public Tetromino getRandomTetromino() {
        Random random = new Random();
        int randomIndex = random.nextInt(tetrominoes.size() - 1);

        return tetrominoes.get(randomIndex);
    }

    public ArrayList<Tetromino> getTetrominoes() {
        return tetrominoes;
    }

    public void setTetrominoes(ArrayList<Tetromino> tetrominoes) {
        this.tetrominoes = tetrominoes;
    }
}
