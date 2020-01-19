//My first Activity 1 ,Slide 5(Course 2 Lecture)
//Mownica -Z1888767

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class classlist {

	public static void main(String[] args) {
		classlist classgrades = new classlist();
		classgrades.printClassList();
		classgrades.printClassList2();
	}
	
	Map<String,String> classList = new HashMap<String,String>();
	public classlist() {
		classList.put("Mownica", "A");
		classList.put("Aishu", "C");
		classList.put("Anish", "B");
		classList.put("Niha", "D");
		classList.put("Sashi", "F");
	}
	
	public void printClassList() {
		Iterator<Entry<String, String>> entries = classList.entrySet().iterator();
		while (entries.hasNext()) {
			Entry<String, String> entry = entries.next();
			System.out.println("Key = " +entry.getKey() + " ,Value = " + entry.getValue());
		}
	}
	
	
	public void printClassList2() {
	for(Map.Entry<String, String> entry : classList.entrySet()) {
	    System.out.println("Key = " +entry.getKey() + " ,Value = " + entry.getValue());	
	}
	
	for (String key : classList.keySet()) {
		System.out.println("Key = " + key);
	}
	
	for (String value : classList.values()) {
		System.out.println("Values = " + value);
	}
	
	}
}
