import java.util.Map;
import java.util.HashMap;

public class HashMapTest {

	public Map<String, String> mapBully(Map<String, String> map) {
		  if(map.containsKey("a")){
		    map.put("b", map.get("a"));
		    map.put("a", "");
		  }
		  return map;
		}
	
	public Map<String, String> mapShare(Map<String, String> map) {
		  if(map.containsKey("a")){
		    map.put("b", map.get("a"));
		  }
		  map.remove("c");
		  return map;
		}

	public Map<String, String> mapAB(Map<String, String> map) {
		  if(map.containsKey("a") && map.containsKey("b")){
		    map.put("ab", map.get("a") + map.get("b"));
		  }
		  return map;
		}
	
	public Map<String, String> topping1(Map<String, String> map) {
		  if(map.containsKey("ice cream")){
		    map.put("ice cream", "cherry");
		  }
		  map.put("bread", "butter");
		  return map;
		}

	public Map<String, String> topping2(Map<String, String> map) {
		  if(map.containsKey("ice cream")){
		    map.put("yogurt", map.get("ice cream"));
		  }
		  if(map.containsKey("spinach")){
		    map.put("spinach", "nuts");
		  }
		  return map;
		}
	
	public Map<String, String> topping3(Map<String, String> map) {
		  if(map.containsKey("potato")){
		    map.put("fries", map.get("potato"));
		  }
		  if(map.containsKey("salad")){
		    map.put("spinach", map.get("salad"));
		  }
		  return map;
		}

	public Map<String, String> mapAB2(Map<String, String> map) {
		  if(map.containsKey("a") && map.containsKey("b")){
		    if(map.get("a").equals(map.get("b"))){
		      map.remove("a");
		      map.remove("b");
		    }
		  }
		  return map;
		}

	public Map<String, String> mapAB3(Map<String, String> map) {
		  if(map.containsKey("a") && !map.containsKey("b")){
		    map.put("b", map.get("a"));
		  }
		  if(map.containsKey("b") && !map.containsKey("a")){
		    map.put("a", map.get("b"));
		  }
		  return map;
		}
	
	public Map<String, String> mapAB4(Map<String, String> map) {
		  if(map.containsKey("a") && map.containsKey("b")){
		    if(map.get("a").length()> map.get("b").length()){
		      map.put("c", map.get("a"));
		    }
		  }
		  if(map.containsKey("a") && map.containsKey("b")){
		    if(map.get("b").length()> map.get("a").length()){
		      map.put("c", map.get("b"));
		    }
		  }
		  if(map.containsKey("a") && map.containsKey("b")){
		    if(map.get("a").length() == map.get("b").length()){
		      map.put("a", "");
		      map.put("b", "");
		    }
		  }
		  return map;
		}

	public Map<String, Integer> word0(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  for (int i=0; i<strings.length; i++) {
		    String s = strings[i];
		    map.put(s, 0);
		  }
		  return map;
		}

	public Map<String, Integer> wordLen(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  for (int i=0; i<strings.length; i++) {
		    String s = strings[i];
		    map.put(s, s.length());
		  }
		   
		  return map;
		}
	
	public Map<String, String> pairs(String[] strings) {
		  Map<String, String> map = new HashMap<String, String>();
				  for (int i=0; i<strings.length; i++) {
				    String s = strings[i];
				    map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length()-1)));
				  }
				  return map;
		}

	public Map<String, Integer> wordCount(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  for(int i=0; i<strings.length; i++){
		    String s = strings[i];
		    if(map.containsKey(s)){
		      int count = map.get(s);
		      map.put(s, count + 1);
		    }else{
		      map.put(s, 1);
		    }
		  }
		  return map;
		}
	
	public Map<String, String> firstChar(String[] strings) {
		  Map<String, String> map = new HashMap<String, String>();
		  for(int i=0; i<strings.length; i++){
		    String s = String.valueOf(strings[i].charAt(0));
		    String value = strings[i];
		    if(map.containsKey(s)){
		      map.put(s, map.get(s)+value);
		    }else{
		    map.put(s, value);
		    }
		  }
		  return map;
		}



}
