package com.jeneric.ch15;

public class MaximumTest {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z){
		Integer i;
		String s;
		T max = x;
		if(y.compareTo(max) > 0) max = y;
		if(z.compareTo(max) > 0) max = z;
		return max;
	}
	
}
