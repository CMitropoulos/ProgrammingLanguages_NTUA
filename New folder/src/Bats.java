import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Bats {
	private static int mapWith = 6;
	private static int mapHeight = 6;
	private static int startX = 0;
	private static int startY = 0;
	private static int goalX = 2;
	private static int goalY = 2;

	public static void main(String[] args) {

		try {
			BufferedReader in = new BufferedReader(new FileReader("bats3.txt"));
			String line = in.readLine();
			String[] a = line.split(" ");
			mapWith = Integer.parseInt(a[0]); /*
											 * borw na xrisimopihsw tin
											 * mapHeight
											 */
			mapHeight = Integer.parseInt(a[1]); /* apo panw pou einai private? */
			int nbElements = Integer.parseInt(a[2]);
			
			/* temp var to read 'A', '-', 'B' from input file */
			int coor_x, coor_y;
			for (int i = 0; i < nbElements; i++) {
				line = in.readLine();
				System.out.print(line);
				a = line.split(" ");
				coor_x = Integer.parseInt(a[0].trim());
				coor_y = Integer.parseInt(a[1].trim());
				if ("A".equals(a[2].trim())) {
					goalX = coor_x;
					goalY = coor_y;
					obstacleMap[coor_x][coor_y] = 0; // is the Target
				} else if ("B".equals(a[2].trim()))
					//TO DO: append in a list the bat coordinates
				else if ("-".equals(a[2].trim()))
					//TO DO: append in a list the wall coordinates
				else
					throw new IllegalArgumentException("Wrong Input");
			}
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}