package javacore18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Map<K, V> {

	private Set<MyEntry> map = new HashSet();

	public Map() {
		super();
	}

	public void show() {
		System.out.println(map);
	}

	public void showKeys() {
		for (MyEntry runThro : map) {
			System.out.println(runThro.getObj1());
		}
	}

	public void ShowValue() {
		for (MyEntry runThro : map) {
			System.out.println(runThro.getObj2());
		}
	}

	public <K> void removeByKey(K key) {
		for (MyEntry entry : map) {
			if (entry.key1.equals(key)) {
				map.remove(entry);
			}
		}
	}

	public <V> void removeByValue(V value) {
		for (Iterator<MyEntry> iterator = map.iterator(); iterator.hasNext();) {
			MyEntry valueFromIterator = iterator.next();
			if (valueFromIterator.getObj2().equals(value)) {
				iterator.remove();
			}
		}
	}

	public <K, V> void Add(K keyValue, V value) {
		map.add(new MyEntry(keyValue, value));
	}
}

class MyEntry<K, V> {

	K key1;
	V verable2;

	public MyEntry(K obj1, V obj2) {
		super();
		this.key1 = obj1;
		this.verable2 = obj2;
	}

	public K getObj1() {
		return key1;
	}

	public void setObj1(K obj1) {
		this.key1 = obj1;
	}

	public V getObj2() {
		return verable2;
	}

	public void setObj2(V obj2) {
		this.verable2 = obj2;
	}

	@Override
	public String toString() {
		return "MyEntry [obj1=" + key1 + ", obj2=" + verable2 + "]";
	}

}
