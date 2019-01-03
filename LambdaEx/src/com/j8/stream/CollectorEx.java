package com.j8.stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorEx {

	public static void main(String[] args) {

		List<Person> personlist = new ArrayList<Person>();
		try (

				BufferedReader br = new BufferedReader(
						new InputStreamReader(CollectorEx.class.getResourceAsStream("person.txt")));

				Stream<String> stream = br.lines();

		) {

			stream.map(line -> {
				String[] s = line.split(" ");
				Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));

				personlist.add(p);

				return p;

			}).forEach(System.out::println);

		} catch (IOException e) {

			System.out.println(e);
		}

		Stream<Person> stream = personlist.stream();

		Optional<Person> op =

				stream.filter(p -> p.getAge() >= 20).min(Comparator.comparing(Person::getName));

		// System.out.println(op);

		Map<Integer, List<String>> pmap = personlist.stream().collect(
				Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));

		System.out.println(pmap);
	}

}
