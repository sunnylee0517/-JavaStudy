package com.collection.ch16;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
	private static final String colors[] = {"black", "yellow", 
		"green", "blue", "violet", "silver"};
	private static final String colors2[] = {"gold", "white",
		"brown", "blue", "gray", "silver"};
	
	public ListTest(){
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		
		for(String color : colors)
			list1.add(color);
		
		for(String color : colors2)
			list2.add(color);
		
		list1.addAll(list2);	//리스트를 연결 
		list2 = null;			//리소트 해제 
		printList(list1);
		
		convertToUppercaseStrings(list1); //대문자로 변환 
		printList(list1);
		
		System.out.println("\nDeleting elements 4 to 6...");
		removeItems(list1, 4, 6);
		printList(list1);
		printReversedList(list1);
		
	}
	
	public void printList(List<String> list){
		System.out.println("\nlist : ");
		
		for(String color : list)
			System.out.printf("%s  ", color);
		
		System.out.println("\n");
		
	}
	
	private void convertToUppercaseStrings(List<String> list){
		ListIterator<String> iterator = list.listIterator();
		//List
		
		while(iterator.hasNext()){
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
	}
	
	private void removeItems(List<String> list, int start, int end){
		list.subList(start, end).clear(); // 항목 제거 
	}
	
	private void printReversedList(List<String> list){
		ListIterator<String> iterator = list.listIterator(list.size());
		
		System.out.println("\nReversed List:");
		while(iterator.hasPrevious())
			System.out.printf("%s  ", iterator.previous());
	}
	
	public static void main(String[] args){
		new ListTest();
	}
}
