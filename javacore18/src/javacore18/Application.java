package javacore18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
	System.out.println(strList);
	
	Map<Integer, String> map = new Map<>();

	//it all works )

	map.Add(1,"Max");
	map.Add(2,"Nazar");
	map.Add(3,"Dimon");
	map.showKeys();
	map.ShowValue();
	map.show();
	map.removeByKey(2);
	map.removeByValue("Dimon");
	map.show();
}
}
