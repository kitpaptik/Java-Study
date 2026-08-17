import java.util.*;

class Board {
	String subject;
	String content;
	String writer;
	
	Board(String subject, String content, String writer){
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}

public class Ans13_08 {
	public static void main(String[] args) {
		Vector list = new Vector();
	
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(4);
		list.remove(2);
		
		for(int i=0; i < list.size(); i++) {
			Board board = (Board)list.get(i);				
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
