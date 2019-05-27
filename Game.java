package graphjava;

public class Game {
	public static void main(String [] args) {
		Maze myMaze = new Maze(3, 3);
		myMaze.setType(0,0, Type.D);
		myMaze.setType(2,2, Type.A);
		

	}
}