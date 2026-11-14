package com.java.basic.oops.features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamAPI_Demo {
	public static void main(String[] args) {
//		source
		List<Integer> l1=Arrays.asList(10,20,30,40,50);
//		create a stream object
//		stream can be created from a collection,array or directly from values
//		stream() on collection returns a stream object
		Stream<Integer> stream=l1.stream();
//		step 3: intermediate operations
		Stream<Integer> filtered=stream.filter(n->n>20);
//		step 4: intermediate operations -sorted
		Stream<Integer> sorted=filtered.sorted();
//		step 5: terminal function
		sorted.forEach(n->System.out.println(n));
	}
} 