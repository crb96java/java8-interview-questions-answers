package com.java8.interview.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortListObjectMain {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Ramesh");
		list.add("Sam");
		list.add("Ashish");
		list.add("Laxmi");
		
		//using java 8 to sort the list object in ascending order
		List<String> ascendingListDetails = list.stream().sorted((e1, e2)->e1.compareTo(e2)).collect(Collectors.toList());
		System.out.println("Ascending Order the list of Name :: "+ascendingListDetails);
		System.out.println();
		System.out.println();
		//using java 8 to sort the list object in descending order
		List<String>  descendingListDetails = list.stream().sorted((e1, e2)-> e2.compareTo(e1)).collect(Collectors.toList());
		System.out.println("Descending Order the list of Name :: "+descendingListDetails);
		
	}

}
