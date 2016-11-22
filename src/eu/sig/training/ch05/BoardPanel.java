package eu.sig.training.ch05;

import java.awt.Graphics;
import java.util.List;

public class BoardPanel {
    @SuppressWarnings("unused")

    private void render(Square square, Graphics g, eu.sig.training.ch05.BoardPanel.SquareCoordinates squareCoordinates) {
        square.getSprite().draw(g, squareCoordinates.getX(), squareCoordinates.getY(), squareCoordinates.getW(), squareCoordinates.getH());
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, squareCoordinates.getX(), squareCoordinates.getY(), squareCoordinates.getW(), squareCoordinates.getH());
        }
    }
    // end::render[]

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g,  eu.sig.training.ch05.BoardPanel.SquareCoordinates squareCoordinates) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }

    }

    private static class SquareCoordinates {
        private final int x;
        private final int y;
        private final int w;
        private final int h;

        private SquareCoordinates(int x, int y, int w, int h) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getW() {
            return w;
        }

        public int getH() {
            return h;
        }
    }
}
