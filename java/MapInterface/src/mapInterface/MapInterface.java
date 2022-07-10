package mapInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos :");
		Map<String, Double> cars = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(cars.toString());
		
		System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
		cars.put("gol", 15.2);
		System.out.println(cars);
		
		System.out.println("Confira se o modelo tucson está no dicionário: " + cars.containsKey("tucon"));
		
		System.out.println("Exiba o consumo do uno: " + cars.get("uno"));
		
		System.out.println("Exiba os modelos");
		Set<String> models = cars.keySet();
		System.out.println(models);
		
		System.out.println("Exiba os consumos dos carros: ");
		Collection<Double> efficiency = cars.values();
		System.out.println(efficiency);
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
		Double mostEfficient = Collections.max(cars.values());
		Set<Map.Entry<String, Double>> entries = cars.entrySet();
		String mostEfficientModel = "";
		
		for(Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(mostEfficient)) {
				mostEfficientModel = entry.getKey();
				System.out.println("Modelo mais eficiente: " + mostEfficientModel + " - " + mostEfficient);
			}
		}
	}
}
