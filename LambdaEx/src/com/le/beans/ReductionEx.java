package com.le.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReductionEx {
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,10);
	
	Integer red=list.stream().reduce(0, Integer::sum);
	
	System.out.println(red);
}
}
