package com.le.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumer {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Hi", "hello", "Namaskar");
		
		List<String> result = new ArrayList<>();
		
		Consumer<String> c1= System.out::println;
		Consumer<String> c2 = result::add;
		
		list.forEach(c1.andThen(c2));
	//	System.out.println(c2.toString());
		
		System.out.println("Size "+result.size());
	}
}
