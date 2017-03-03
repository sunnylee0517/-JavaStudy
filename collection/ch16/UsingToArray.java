package com.collection.ch16;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {
	//생성자가 LinkedList를 생성하고, 요소를 추가하고 배열로 변환 
	public UsingToArray(){
		String colors[] = {"black", "blue", "yellow"};
		//Arrays.asList : 배열을 List 컬렉션으로 만들어 줌 
		LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));
		
		links.addLast("red");	//마지막 항목으로 추가 
		links.add("pink");		//맨 끝에 추가 
		links.add(3, "green");	//3번째 인덱스로 추가 
		links.addFirst("cyan"); //첫 항목으로 추가 
		
		//LinkedList  요소를 배열로 얻음 ( toArray : 컬렉션을 배열로 만들어줌 ) 
		colors = links.toArray(new String[links.size()]);
		
		System.out.println("colors : ");
		
		for(String color : colors)
			System.out.println(color);
	}
	public static void main(String[] args){
		new UsingToArray();
	}
}
