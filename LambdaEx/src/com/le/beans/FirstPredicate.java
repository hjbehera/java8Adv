package com.le.beans;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {

	public static void main(String[] args) {
		
		Stream<String> streams=Stream.of("One","Two","Three","four");
		
		Predicate<String> p = s -> s.length()>3;
		Predicate<String> p1= Predicate.isEqual("four");
		
		streams.filter(p.and(p1)).forEach(System.out::println);
	}
}
