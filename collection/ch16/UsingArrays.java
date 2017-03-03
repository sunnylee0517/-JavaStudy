package com.collection.ch16;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class UsingArrays {
	private int intArray[] = {1, 2, 3, 4, 5, 6};
	private double doubleArray[] = {8.4, 9.3, 0.2, 7.9, 3.4};
	private int filledArray[], intArrayCopy[];
	
	public UsingArrays(){
		filledArray = new int[10];
		intArrayCopy = new int[intArray.length];
		
		Arrays.fill(filledArray, 7);
		Arrays.sort(doubleArray);
		
		//System. 메서드 arraycopy로 전달된 첫번째 인수(intArray)는 요소가 복사해 올 배열이다. 
		//두 번째 인수(0)는 복사할 요소의 범위의 시작 지점을 지정하는 인덱스다. 이 값으로 유효한 배열 인덱스가 올 수 있다.
		//세 번째 인수(intArrayCopy)는 복사본을 저장할 대상 배열을 지정한다.
		//네 번째 인수(0)는 복사된 요소가 저장되어야 할 대상 배열에서의 인덱스를 지정한다. 
		//마지막 인수는 첫 번째 인수에 있는 배열로부터 복사할 요소의 수를 지정한다. 
		System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
		
	}
	
	public void printArray(){
		for(double doubleValue : doubleArray)
			System.out.printf("%.1f  ", doubleValue);
		
		System.out.println("");
		for(int intValue : intArray)
			System.out.printf("%d  ", intValue);
		
		System.out.println("");
		for(int intValue : filledArray)
			System.out.printf("%d  ", intValue);
		
		System.out.println("");
		for(int intValue : intArrayCopy)
			System.out.printf("%d  ", intValue);
	}
	
	public int searchForInt(int value){
		return Arrays.binarySearch(intArray, value);
	}
	
	public void printEquality(){
		boolean b = Arrays.equals(intArray, intArrayCopy);
		System.out.printf("intArray %s intArrayCopy \n", b ? "==": "!=");
		
		b = Arrays.equals(intArray, filledArray);
		System.out.printf("intArray %s filledArray \n", b ? "==": "!=");
	}
	
	public static void main(String args[]){
		UsingArrays usingArrays = new UsingArrays();
		
		usingArrays.printArray();
		usingArrays.printEquality();
		
		int location = usingArrays.searchForInt(5);
		if(location >= 0)
			System.out.printf("Found 5 at element %d in intArray\n", location);
		else
			System.out.printf("5 not found in intArray");
		
		location = usingArrays.searchForInt(8763);
		if(location >= 0)
			System.out.printf("Found 8763 at element %d in intArray\n", location);
		else
			System.out.printf("8763 not found in intArray");
		
	}
	
	private void removeCollection(Collection<String> collection1, Collection<String> collection2){
		Iterator<String> iterator = collection1.iterator();
		
		while(iterator.hasNext()){
			if(collection2.contains(iterator.next()))
				iterator.remove();
		}
	}
}
