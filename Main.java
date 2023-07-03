// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static final int MAX_X = 18; //오목판 X크기 상수지정
    public static final int MAX_Y = 18; //오목판 Y크기 상수지정
    public static void main(String[] args) {
        Board boardone = new Board();
        boardone.getXsize(MAX_X);
        boardone.getYsize(MAX_Y);
        boardone.makeboard();

        GUI.GUI();
    }
}

class Boardcell {
    protected int who = 0;

    void setblack() {
        this.who = 1;
    }

    void setwhite() {
        this.who = 2;
    }
}

class Board {
    Boardcell[][] board = null;
    protected int y;
    protected int x;

    void getXsize(int a) {
        this.x = a;
    }

    void getYsize(int a) {
        this.y = a;
    }

    void makeboard() {
        board = new Boardcell[this.y][];
        for(int i = 0; i < this.y; i++) {
            board[i] = new Boardcell[this.x];
        }
    }
}