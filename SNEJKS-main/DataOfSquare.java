import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {

	ArrayList<Color> C = new ArrayList<Color>();
	int color;
	SquarePanel square;

	public DataOfSquare(int col) {

		C.add(Color.darkGray);
		C.add(Color.red);
		C.add(Color.lightGray);
		color = col;
		square = new SquarePanel(C.get(color));
	}

	public void lightMeUp(int c) {
		square.ChangeColor(C.get(c));
	}
}
