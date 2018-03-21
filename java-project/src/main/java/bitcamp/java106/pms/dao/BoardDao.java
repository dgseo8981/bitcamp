package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Board;

public class BoardDao {

    Board[] boards = new Board[1000];
    int boardIndex = 0;
    
    public void insert(Board board) {
        board.no = boardIndex;
        this.boards[this.boardIndex++] = board;
    }
    
    public Board[] list() {
        Board[] arr = new Board[this.boardIndex];
        for(int i = 0; i < this.boardIndex; i++) {
            arr[i] = this.boards[i];
        }
        return arr;
    }
    
    public Board get(int i) {
        if(i < 0 || i >= this.boardIndex) {
            return null;
        }
        return this.boards[i];
    }
    
    public void update(Board board) {
        this.boards[board.no] = board;
    }
    
    public void delete(int i) {
        this.boards[i] = null;
    }

}
