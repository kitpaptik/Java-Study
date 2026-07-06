import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

class MapClass {
	private static Scanner stdIn;
	private static Random rand;

	private int UserX;					//사용자의 현재위치 배열의 행(row)
	private int UserY;					//사용자의 현재위치 배열의 열(column)
	private int MapStartX;				//맵의 시작위치 배열의 행(row)
	private int MapStartY;				//맵의 시작위치 배열의 열(column)
	private int MaxHeight;				//사용중인 배열의 행(row)의 수
	private int MaxWidth;				//사용중인 배열의 열(column)의 수
	private boolean[][]	MapTable; 		//맵의 정보를 가지고 있는 배열 true: 길, false: 길 아님
	private int[][] UserTable; 			//사용자의 이동경로를 나타내는 배열, 0: 안지나감, 1:길을 지나감, 2:길아닌곳을 지나감 
	
	static {
		stdIn = new Scanner(System.in);
		rand = new Random();
	} 
	
	public static void ClearScreen() {  //cmd 화면을 지움
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	} 
	
	public static void Delay(int ms) {  //실행시간 지연
		try {
			Thread.sleep(ms); //1000 1초 sleep
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//필요한 메소드 추가가능

	public void MapSetting(int Height, int Width){
		MaxHeight = Height;
		MaxWidth = Width;
	}
	
	public void GameStart() {
		FirstMapSetting();
		ShowAnswerMap();
		UserMapSetting();
		MoveMap();		
	}
	
	private void FirstMapSetting() {
		//필요한 변수 추가
				
		MapTable = new boolean[MaxHeight+1][MaxWidth+1];	//맵을 나타내는 배열
		
		System.out.println("배열에 맵 정보(길 있음, 없음 설정)를 랜덤하게 설정한다.");	
		//...
	}

	private void ShowAnswerMap() { 
	    System.out.println("완성된 맵 전체(길, 길 아님)와 도착점을 보여준다.");
        //길: System.out.print("□");
        //길아님: System.out.print("■");
        //마지막 도착점(우측 또는 아래): System.out.print("★");
		//...
	}
	
	private void UserMapSetting() {
		System.out.println("사용자의 시작점과 지나간 길을 초기화한다.");

		int i, j;
		UserTable= new int[MaxHeight+1][MaxWidth+1];	//사용자의 이동경로를 나타내는 배열 0: 안지나감, 1:길을 지나감, 2:길아닌곳을 지나감
		
		UserX = MapStartX;
		UserY = MapStartY;

		//for(i=0; ... ; i++) 			//사용자가 지나간 길을 초기화
			//for(j=0; ...  ; j++)
				//...						//모든길은 안지나감으로 설정 	
		//UserTable[ ... ][ ... ] = 1;	//맵의 시작위치를 사용자 시작점으로 설정(좌측 상단)
	}
	
	private void MoveMap() { 
		char choice;
		boolean ContinueCheck = true;
				
		ShowMoveMap();		//현재 맵의 상태를 보여준다.
		while(ContinueCheck) {
			System.out.print("[↑: U] [↓: D] [←: L] [→:R] [종료:Q]: ");
			choice = stdIn.next().charAt(0);
			if(choice!='U' && choice!='D' && choice!='L' && choice!='R' && choice!='Q') 
				continue;
			if (choice == 'Q') {
				System.exit(0);		//종료
			}
			
			ContinueCheck = UserMoveCheck(choice);		//사용자의 입력에 따라 움직이고 길로 갔는지(성공) 아닌지 처리(실패)한다.
		}
	}
	
	private void ShowMoveMap() { //현재 맵의 상태를 보여준다.
		System.out.println("현재 맵의 상태를 보여준다.");
		//안지나감: System.out.print("■");
        //지나간 길: System.out.print("□");
        //현재 위치: System.out.print("○");	
        //길아닌곳을 지나감 System.out.print("⊙");
	}
	
	private boolean UserMoveCheck(char Move){
		
		//오른쪽, 왼쪽, 위쪽, 아래쪽 제어

		ShowMoveMap();
		return true;	//게임계속
	}
	
    //필요한 메소드 추가
}

class MazeGameClass {
	private static Scanner stdIn;
    private MapClass map = new MapClass();
	
	static {
		stdIn = new Scanner(System.in);
	}
	
	public static void ClearScreen() {  //cmd 화면을 지움
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	}
	
	//필요한 코드 또는 메소드 추가가능 
	
	public void GamePlay() {
		while(true)
		{
			GameStartView();
			map.GameStart();
			System.out.print("아무키나 누르면 계속 합니다.(Q: 종료): ");	
			char key = stdIn.next().charAt(0);
			if(key == 'Q'){
				System.exit(0);		//종료
			}
		}
	}
	
	private void GameStartView() {	//게임 시작 화면 출력
		while(true) {
			ClearScreen();
			System.out.println("★ Brain Survival Final Game ★");
			System.out.println("작 성 자 : 홍길동");
			System.out.println("작성일자 : 2021. 3. 1");
			
			char choice;
			while(true) {
				System.out.print("게임시작(S) 종료(Q): ");
				choice = stdIn.next().charAt(0);
				if(choice=='S'|| choice=='Q') break;
				else 
					System.out.println("잘못 입력하셨습니다!!!\n\n");
			}
			
			if(choice =='S') {
				map.MapSetting(8, 8); 		
				return;
			}
			else if(choice == 'Q'){ 
				System.exit(0);		//종료
			}
		}
	}
}

public class Mini12_01 {
    public static void main(String[] args) {
		MazeGameClass game = new MazeGameClass();
		game.GamePlay();
    }
}
