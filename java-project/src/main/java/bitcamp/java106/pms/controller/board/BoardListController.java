package bitcamp.java106.pms.controller.board;

import java.io.PrintWriter;
import java.util.Iterator;

import bitcamp.java106.pms.Annotation.Component;
import bitcamp.java106.pms.controller.Controller;
import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.server.ServerRequest;
import bitcamp.java106.pms.server.ServerResponse;

@Component("/board/list")
public class BoardListController implements Controller {
    BoardDao boardDao;
    
    public BoardListController(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
    
    @Override
    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        
        Iterator<Board> iterator = boardDao.list();
        while (iterator.hasNext()) {
            Board board = iterator.next();
            out.printf("%d, %s, %s\n", board.getNo(), board.getTitle(), board.getCreatedDate());
        }
    }
    
}