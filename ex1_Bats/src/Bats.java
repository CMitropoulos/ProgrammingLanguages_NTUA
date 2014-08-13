import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bats {
	public static int mapWidth = 6;
	public static int mapHeight = 6;
	public static int startX = 0;
	public static int startY = 0;
	public static int goalX = 2;
	public static int goalY = 2;

	public static void main(String[] args) {
		ArrayList<Integer> bats_coor = new ArrayList<Integer>();
		ArrayList<Integer> wall_coor = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> bats = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> wall = new ArrayList<ArrayList<Integer>>();
		try {
			BufferedReader in = new BufferedReader(new FileReader("bats3.txt"));
			String line = in.readLine();
			String[] a = line.split(" ");

			mapWidth = Integer.parseInt(a[0]); /*
											 * borw na xrisimopihsw tin
											 * mapHeight
											 */
			mapHeight = Integer.parseInt(a[1]); /* apo panw pou einai public? */
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

				} else if ("B".equals(a[2].trim())) {
					// TO DO: append in a list the bat coordinates
					bats_coor.add(coor_x);
					bats_coor.add(coor_y);
					bats.add(bats_coor);
					bats_coor.clear();
				}

				else if ("-".equals(a[2].trim())) {
					// TO DO: append in a list the wall coordinates
					wall_coor.add(coor_x);
					wall_coor.add(coor_y);
					wall.add(wall_coor);
					wall_coor.clear();
				}
				else
					throw new IllegalArgumentException("Wrong Input");
			}
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}