package classwork9.kryvenkosergii_lv44;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void main(String[] args) {
		List<Plant> plant = new ArrayList<Plant>();
		try {
			plant.add(new Plant(10, "red", "rose"));
			plant.add(new Plant(20, "blue", "peony"));
			plant.add(new Plant(30, "white", "lavanda"));
			plant.add(new Plant(40, "white", "floverx"));
			plant.add(new Plant(50, "orange", "rose"));
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
		for (Plant plant2 : plant) {
			System.out.println(plant2);
		}

	}

}
