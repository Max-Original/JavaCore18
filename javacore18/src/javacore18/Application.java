package javacore18;

import java.util.ArrayList;
import java.util.List;

public class Application {
public static void main(String[] args) {
	
	// We are casting our veriables from String to Integer
	
	List<String> strList = new ArrayList<>();
	strList.add("1");
	strList.add("1");
	strList.add("1");
	strList.add("1");
	strList.add("1");
	
	List<Integer> intList = new ArrayList<>();
	for (String runStr : strList) {
		{
			intList.add(Integer.valueOf(runStr));
		}
	}
	System.out.println(intList);
	
	List<MyEntry> myEntry = new ArrayList<MyEntry>();
	myEntry.add(new MyEntry("Max", "Hello"));
	myEntry.add(new MyEntry("s", "m"));
	
	Map<MyEntry> map = new Map(myEntry);

	//it all works )
	
	map.show();
	map.showKeys();
	map.ShowValue();
	map.removeByValue();
	map.removeByKey();
	map.Add();
	map.show();
}
}
