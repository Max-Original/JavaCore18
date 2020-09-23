package javacore18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Map<K extends MyEntry> {

	private List<MyEntry> map = new ArrayList();

	public Map(List<MyEntry> map) {
		super();
		this.map = map;
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

	public <V> void removeByValue() {
		System.out.println("enter value");
		Scanner scanner = new Scanner(System.in);
		V verable = (V) scanner.next();
		for (Iterator<MyEntry> iterator = map.iterator(); iterator.hasNext();) {
			MyEntry value = iterator.next();
			if (value.getObj2().equals(verable)) {
				iterator.remove();
			}
		}
	}

	public <K> void removeByKey() {
		System.out.println("enter value");
		Scanner scanner = new Scanner(System.in);
		K keyValue = (K) scanner.next();
		for (Iterator<MyEntry> iterator = map.iterator(); iterator.hasNext();) {
			MyEntry value = iterator.next();
			if (value.getObj1().equals(keyValue)) {
				iterator.remove();
			}
		}
	}

	public <K, V> void Add() {
		System.out.println("Enter your key");
		Scanner scanner = new Scanner(System.in);
		K keyValue = (K) scanner.next();
		System.out.println("Enter your Value");
		V value = (V) scanner.next();
		map.add(new MyEntry(keyValue, value));
		
	}
}

class MyEntry<K,V> {
	
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
