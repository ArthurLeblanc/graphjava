package graphjava;

public class Maze {
	private int height;
	private int width;
	private Vertex[][] arrayMaze;

	enum Type {
		D,
		.,
		O,
		A
	}

	public Maze(int height, int width) {
		this.height = height;
		this.width = width;
		arrayMaze = new Vertex[height][width] ;
		for (int i = 0; i < height; i++) {
			for (int j = 0; i < width; j++) {
				arrayMaze[i][j] = new Vertex(".");
			}
		}
	}

	public void getType(int height, int width) {
		return this.arrayMaze[height][width].getContent();
	}

	public void setType(int height, int width, Type type) {
		this.arrayMaze[height][width].setContent(type);
	}

	public void toString() {
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				System.out.println(this.getType(i, j));
			}
			System.out.println("\n");
		}
	}
}