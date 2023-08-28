package mock_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map= new LinkedHashMap<>();
          map.put("surya", 24);
          map.put("janu", 18);
          map.put("ram", 25);
          map.put("geetha", 28);
          
         System.out.println(map.get("surya"));
          
         map.entrySet().stream().filter(entry->entry.getValue()>20).forEach(entry->System.out.println(entry.getKey()+" "+ entry.getValue()));
	}

}
